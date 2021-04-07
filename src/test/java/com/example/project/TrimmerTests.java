package com.example.project;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TrimmerTests {

    @Test
    @DisplayName("trim method should trim right")

    void trimsomething() {
        Trimmer trimmer = new Trimmer(); // setup
        // execute and verify
        assertEquals("allo", trimmer.trim("hallo", 'h'), "Trimming: End result should be allo");
        assertEquals("hall", trimmer.trim("hallo", 'o'), "Trimming: End result should be hall");
        assertEquals("hallo", trimmer.trim("hallo", 'a'), "Trimming: End result should be hallo");
    }
}
