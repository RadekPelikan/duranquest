package com.company;

import java.util.Locale;
import java.util.Scanner;

public class GameDialog {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    private Scanner scanner = new Scanner(System.in);

    public void intro(String gameName, double version, String author) {
        System.out.println("Vitejte ve hre");
        System.out.print(ANSI_WHITE);
        System.out.println("-----------------------------------");
        System.out.print(ANSI_RED);
        System.out.println(gameName + " v" + version);
        System.out.print(ANSI_WHITE);
        System.out.println("-----------------------------------");
        System.out.print(ANSI_RESET);
        System.out.println("Vytvoril " + ANSI_CYAN + author);
        System.out.print(ANSI_RESET);
        System.out.println();
    }

    public void say(String sentence) {
        String[] words = sentence.split(" ");
        for (String word : words) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public void say(String sentence, String color) {
        switch (color.toLowerCase(Locale.ROOT)) {
            case "black" -> System.out.print(ANSI_BLACK);
            case "red" -> System.out.print(ANSI_RED);
            case "green" -> System.out.print(ANSI_GREEN);
            case "yellow" -> System.out.print(ANSI_YELLOW);
            case "blue" -> System.out.print(ANSI_BLUE);
            case "purple" -> System.out.print(ANSI_PURPLE);
            case "cyan" -> System.out.print(ANSI_CYAN);
            case "white" -> System.out.print(ANSI_WHITE);
        }
        say(sentence);
        System.out.print(ANSI_RESET);
    }

    public String userInput() {
        return scanner.nextLine();
    }
}
