package com.example.project;

public class Trimmer {

    public String trim(String value, char c) {
        int len = value.length();
        int st = 0;

        while ((st < len) && (value.charAt(st) == c)) {
            st++;
        }
        while ((st < len) && (value.charAt(len - 1) ==c )) {
            len--;
        }
        if ((st > 0) || (len < value.length())) {
            return value.substring(st, len);
        }
        return value;
    }
}
