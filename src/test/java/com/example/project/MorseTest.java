package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseTest {

    @Test
    public void testReplaceDotsWithStop() {
        //init
        Morse morse = new Morse("test");
        //run + assert
        Assertions.assertEquals("We found gold, send more moneySTOP", morse.replaceDotsWithStop("We found gold, send more money."));
        //cleanup
    }

    @Test
    public void testCutString() {
        //init
        Morse morse = new Morse("test");
        //run + assert
        Assertions.assertEquals("WE FOUND GOLD SEND MORE MONEY", morse.cutString("We found gold, send more money."));
        //cleanup
    }


    @Test
    public void toMorse() {
        //init
        Morse morse = new Morse("test");
        //run + assert
        Assertions.assertEquals(".-- . ..-. --- ..- -. -.. --. --- .-.. -.. ... . -. -.. -- " +
                "--- .-. . -- --- -. . -.-- ... - --- .--.", morse.toMorse("We found gold, send more money."));
        //cleanup
    }

    @Test
    public void toNoParameterMorse() {
        //init
        Morse morse = new Morse("We found gold, send more money.");
        //run + assert
        Assertions.assertEquals(".-- . ..-. --- ..- -. -.. --. --- .-.. -.. ... . -. -.. -- " +
                "--- .-. . -- --- -. . -.-- ... - --- .--.", morse.toMorse());
        //cleanup
    }




}
