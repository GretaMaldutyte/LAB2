package com.example.lab2_greta_maldutyte;

public class ElementCalculator {
    public static int getCharsCount(String inputText) {
        if (inputText != null) {
            return inputText.length();
        }
        return 0;
    }

    public static int getWordsCount(String userInputText) {
        int count = 0;
        char[] symbolsArray = userInputText.toCharArray();
        for (char c : userInputText.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                count++;
            }
        }
        if (count == 0) {
            return 1;
        } else {
            return count;
        }
    }
}
