package com.example.project;

public class Morse {

    String str;

    final static String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "-----",
            ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.","-----"};

    final static String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M",
            "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "1", "2", "3", "4",
            "5", "6", "7", "8", "9", "0"};

    public Morse(String str) {
        this.str = str;
    }

    public static String replaceDotsWithStop(String str) {

        return str.replace(".", "STOP");
    }

    public static String cutString(String input) {
        StringBuilder tmp = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c) || c == ' ') {
                tmp.append(Character.toUpperCase(c));
            }
        }
        return tmp.toString();
    }




    public String toMorse(String str) {

        str = replaceDotsWithStop(str);
        str = cutString(str);

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (str.charAt(i) == alphabet[j].charAt(0)) {
                    if (i == str.length() - 1)
                        res.append(morseCode[j]);
                    else {
                        res.append(morseCode[j]).append(" ");
                    }
                }
            }
        }

        return res.toString();
    }

    public String toMorse() {

        this.str = replaceDotsWithStop(this.str);
        this.str = cutString(this.str);

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < alphabet.length; j++) {
                if (str.charAt(i) == alphabet[j].charAt(0)) {
                    if (i == str.length() - 1)
                        res.append(morseCode[j]);
                    else {
                        res.append(morseCode[j]).append(" ");
                    }
                }
            }
        }
        this.str = res.toString();

        return this.str;
    }


}
