package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrimmerTests {
//test
        @Test
        void testTrimLeft() {
            //init
            Trimmer trimmer = new Trimmer();
            //run
            String result = trimmer.trim("   Test", ' ');
            //assert
            assertEquals("Test", result);

        }

        //test that it trims a string on the right side
        @Test
        void testTrimRight() {
            //init
            Trimmer trimmer = new Trimmer();
            //run
            String result = trimmer.trim("Test   ", ' ');
            //assert
            assertEquals("Test", result);
            //cleanup
        }

        //test that it trims a string on both sides
        @Test
        void testTrimBoth() {
            Trimmer trimmer = new Trimmer();
            String result = trimmer.trim("   Test   ", ' ');
            assertEquals("Test", result);
        }

        //test that it doesn't trim a string that doesn't need trimming
        @Test
        void testTrimNoTrim() {
            //init
            Trimmer trimmer = new Trimmer();
            //run
            String result = trimmer.trim("Test", ' ');
            //assert
            assertEquals("Test", result);
            //cleanup
        }
        @Test
        void testExtremeLongTrim() {
            //init
            Trimmer trimmer = new Trimmer();
            //run
            String result = trimmer.trim("                                                                                                                             Test                                                                         ", ' ');
            //assert
            assertEquals("Test", result);
            //cleanup
        }






}
