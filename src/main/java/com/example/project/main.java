package com.example.project;

import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);  // Create a Scanner object
    Morse morse = new Morse("");
public void checkInput() {


    System.out.println("Enter the text you want to code");

    String userinput = scanner.nextLine();  // Read user input
    System.out.println("The Input is as follow " + userinput);  // Output user input


    String result = morse.toMorse(userinput);
    System.out.println("The Morse code is as follow " + result);  // Output user input



}
        public static void main(String[] args) {
            main main = new main();
            while (true){
                main.checkInput();
            }
        }
}
