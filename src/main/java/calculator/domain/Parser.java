package calculator.domain;

import java.util.regex.Pattern;

public class Parser {
    private static final String DEFAULT_DELIMITER_REGEX = "[,:]";
    private static final String CUSTOM_DELIMITER_PREFIX = "//";
    private static final String CUSTOM_DELIMITER_SUFFIX = "\n";

    private String getCustomDelimiter(String input) {
        int startIndex = CUSTOM_DELIMITER_PREFIX.length();
        int endIndex = input.indexOf(CUSTOM_DELIMITER_SUFFIX);
        return input.substring(startIndex, endIndex);
    }

    // 구분자 정규식(기본 + 커스텀) 반환
    private String getDelimiterRegex(String input) {
        if (input.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            String custom = getCustomDelimiter(input);
            return DEFAULT_DELIMITER_REGEX + "|" + Pattern.quote(custom);
        }
        return DEFAULT_DELIMITER_REGEX;
    }

    private String removeCustomDelimiter(String input) {
        if (input.startsWith(CUSTOM_DELIMITER_PREFIX)) {
            int endIndex = input.indexOf(CUSTOM_DELIMITER_SUFFIX) + CUSTOM_DELIMITER_SUFFIX.length();
            return input.substring(endIndex);
        }
        return input;
    }

    // 피연산자 구하기
    public String[] getOperand(String input) {
        if (input == null || input.isBlank()) {
            return new String[0];
        }
        String delimiterRegex = getDelimiterRegex(input);
        String numbersPart = removeCustomDelimiter(input);
        return numbersPart.split(delimiterRegex);
    }

}
