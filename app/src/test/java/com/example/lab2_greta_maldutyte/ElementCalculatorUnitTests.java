package com.example.lab2_greta_maldutyte;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElementCalculatorUnitTests {
    // getCharsCount Unit Tests

    @Test
    public void Given_NullString_When_getCharsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        final String givenString = null;

        final int expectedResult = 0;
        final int actualResult = ElementCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_EmptyString_When_getCharsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithNoSpaces_When_getCharsCountIsCalled_Then_ReturnedNumberOfCharsInString(){
        final String givenString = "testing";

        final int expectedResult = 7;
        final int actualResult = ElementCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithSpacesOnly_When_getCharsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "        ";

        final int expectedResult = 0;
        final int actualResult = ElementCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithPunctuationMarksOnly_When_getCharsCountIsCalled_Then_ReturnedNumberOfSymbols(){
        final String givenString = ",:[|~";

        final int expectedResult = 5;
        final int actualResult = ElementCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithWordsSeparatedWithSpaces_When_getCharsCountIsCalled_Then_ReturnedNumberOfNonWhitespaceCharacters(){
        final String givenString = "one two three";

        final int expectedResult = 11;
        final int actualResult = ElementCalculator.getCharsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    // getWordsCount Unit Tests

    @Test(expected = NullPointerException.class)
    public void Given_NullString_When_getWordsCountIsCalled_Then_NullPointerExceptionIsThrown(){
        ElementCalculator.getWordsCount(null);
    }

    @Test
    public void Given_EmptyString_When_getWordsCountIsCalled_Then_ReturnedZero(){
        final String givenString = "";

        final int expectedResult = 0;
        final int actualResult = ElementCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_SingleWordWithNoSpaces_When_getWordsCountIsCalled_Then_ReturnedOne(){
        final String givenString = "testing";

        final int expectedResult = 1;
        final int actualResult = ElementCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_StringWithSpacesOnly_When_getWordsCount_Then_ReturnedZero(){
        final String givenString = "        ";

        final int expectedResult = 0;
        final int actualResult = ElementCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_ThreeWordsSeparatedByCommas_When_getWordsCountIsCalled_Then_ReturnedThree(){
        final String givenString = "one,two,three";

        final int expectedResult = 3;
        final int actualResult = ElementCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Given_ThreeWordsSeparatedBySpaces_When_getWordsCountIsCalled_Then_ReturnedThree(){
        final String givenString = "one two three";

        final int expectedResult = 3;
        final int actualResult = ElementCalculator.getWordsCount(givenString);

        assertEquals(expectedResult, actualResult);
    }
}