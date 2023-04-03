package com.example.project;

import com.example.project.Morse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MorseTest {

    @Test
    public void testReplaceDotsWithStop() {
        Morse morse = new Morse("test");
        Assertions.assertEquals("We found gold, send more moneySTOP", morse.replaceDotsWithStop("We found gold, send more money."));
    }

    @Test
    public void testCutString() {
        Morse morse = new Morse("test");
        Assertions.assertEquals("WE FOUND GOLD SEND MORE MONEY", morse.cutString("We found gold, send more money."));
    }

    @Test
    public void testEncodeToMorse() {
        Morse morse = new Morse("test");
        Assertions.assertEquals(".-- . ..-. --- ..- -. -.. --. --- .-.. -.. ... . -. -.. -- " +
                "--- .-. . -- --- -. . -.-- ... - --- .--.", morse.encodeToMorse("We found gold, send more money."));
    }




}
