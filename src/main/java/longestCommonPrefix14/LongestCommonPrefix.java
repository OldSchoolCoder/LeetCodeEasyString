package longestCommonPrefix14;

import java.util.Arrays;

public class LongestCommonPrefix {

    public static void main(String[] args) {

    }

    public String longestCommonPrefix(String[] strArr) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < strArr[0].length()) {
            char chr = strArr[0].charAt(index);
            for (int i = 1; i < strArr.length; i++) {
                if (index == strArr[i].length()) {
                    return String.valueOf(result);
                }
                if (strArr[i].charAt(index) != chr) {
                    return String.valueOf(result);
                }
            }
            result.append(chr);
            index++;
        }
        return String.valueOf(result);
    }
}

