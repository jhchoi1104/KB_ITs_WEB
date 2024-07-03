package org.scoula.lib.cli.ui;

import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in);

    public static int getInt(String title) {
        System.out.print(title);
        return Integer.parseInt(scanner.nextLine());
    }

    public static String getLine(String title) {
        System.out.print(title);
        return scanner.nextLine();
    }

    public static String getLine(String title, String defaultValue) {
        System.out.printf("%s(%s): ", title, defaultValue);
        String answer = scanner.nextLine();

        return answer.isEmpty() ? defaultValue : answer;
    }

    public static boolean confirm(String title) {
        return confirm(title, true);
    }

    public static boolean confirm(String title, boolean defaultValue) {
        String yesNO = defaultValue? "(Y/n)":"y/N";
        System.out.printf("%s %s: ", title, yesNO);

        String answer = scanner.nextLine();
        if (answer.isEmpty())
            return defaultValue;

        return answer.equalsIgnoreCase("y");
    }
}
