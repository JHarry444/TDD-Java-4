package com.qa.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringTokeniserTest {



    @Test
    void testReturnBlank() {
        // arrange
        String input = "";
        String[] expectedOutput = {};
        // act
        String[] actualOutput = StringTokeniser.tokenise(input);
        // assert
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReturnSingleTag() {
        // arrange
        String input = "Java";
        String[] expectedOutput= {input};
        // act
        String[] actualOutput = StringTokeniser.tokenise(input);
        // assert
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }

    @Test
    void testReturnTwoTags() {
        // arrange
        String input = "Java, C#";
        String[] expectedOutput= {"Java", "C#"};
        // act
        String[] actualOutput = StringTokeniser.tokenise(input);
        // assert
        Assertions.assertArrayEquals(expectedOutput, actualOutput);
    }
}
