package com.example.project;

public class StatefulTrimmer {

    private String value;

    public StatefulTrimmer(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void trim(char c) {
        int len = value.length();
        int st = 0;

        while ((st < len) && (value.charAt(st) == c)) {
            st++;
        }
        while ((st < len) && (value.charAt(len - 1) == c )) {
            len--;
        }
        if ((st > 0) || (len < value.length())) {
            value = value.substring(st, len);
        }
    }
}
