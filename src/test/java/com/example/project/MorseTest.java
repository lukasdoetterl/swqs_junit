package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MorseTest {
    Morse morse;
    @BeforeEach
    public void initEach(){
        morse = new Morse();
    }

    @Test
    public void testReplaceDotsWithStop() {
        //init
        //run + assert
        assertEquals("We found gold, send more moneySTOP", morse.replaceDotsWithStop("We found gold, send more money."));
        //cleanup
    }

    @Test
    public void testCutString() {
        //init
        //run + assert
        assertEquals("WE FOUND GOLD SEND MORE MONEY", morse.cutString("We found gold, send more money."));
        //cleanup
    }


    @Test
    public void toMorse() {
        //run + assert
        assertEquals(".-- . ..-. --- ..- -. -.. --. --- .-.. -.. ... . -. -.. -- " +
                "--- .-. . -- --- -. . -.-- ... - --- .--.", morse.toMorse("We found gold, send more money."));
        //cleanup
    }

    @Test
    public void toNoParameterMorse() {
        //init
        Morse morseNoParams = new Morse("We found gold, send more money.");
        //run + assert
        assertEquals(".-- . ..-. --- ..- -. -.. --. --- .-.. -.. ... . -. -.. -- " +
                "--- .-. . -- --- -. . -.-- ... - --- .--.", morseNoParams.toMorse());
        //cleanup
    }
    @ParameterizedTest(name = "{0} => {1}")
    @CsvSource({
            "hello??8731249x178983846'*'*'ko   pewfj..., .... . .-.. .-.. --- --... -.... ..--- ----- .---- ...-- ---.. -..- ----- -.... --... ---.. --... ..--- --... ...-- ..... -.- --- .--. . .-- ..-. .--- ... - --- .--. ... - --- .--. ... - --- .--.",
            "...hello, ... - --- .--. ... - --- .--. ... - --- .--. .... . .-.. .-.. ---",
            "!!!t, -"
    })
    void toMorseParamsTest(String string, String expectedResult) {
        //run + assert
        assertEquals(expectedResult, morse.toMorse(string),
                string + " should be transformed to " + expectedResult);
        //cleanup
    }





}
