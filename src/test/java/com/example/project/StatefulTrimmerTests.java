package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


// setup
// execute
// verify
// cleanup

class StatefulTrimmerTests {

    @Test
    @DisplayName("getValue should be Test")



    void getValue() {
        StatefulTrimmer testobject = new StatefulTrimmer("Test"); // setuo
        // execute and verify
        assertEquals("Test", testobject.getValue(), "getValue should be Test");
    }


    @Test
    @DisplayName("trim should be trim right")
    void trimsomething() {
        StatefulTrimmer trimmer = new StatefulTrimmer("Hallo"); // setup
        trimmer.trim('H'); // execute
        assertEquals("allo", trimmer.getValue(), "Trimming: End result should be allo"); // verify
        StatefulTrimmer trimmer1 = new StatefulTrimmer("Hallo"); // setup
        trimmer1.trim('o'); //execute
        assertEquals("Hall", trimmer1.getValue(), "Trimming: End result should be hall");//verify
        StatefulTrimmer trimmer2 = new StatefulTrimmer("Hallo"); // setup
        trimmer2.trim('a');//execute
        assertEquals("Hallo", trimmer2.getValue(), "Trimming: End result should be hallo");//verify
    }
}
