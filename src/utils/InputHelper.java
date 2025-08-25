package utils;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner SC = new Scanner(System.in);


    public static String readString(String prompt) {
        System.out.print(prompt);
        return SC.nextLine().trim();
    }


    public static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = SC.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("please enter a valid number!");
            }
        }
    }


    public static int readIntInRange(String prompt, int min, int max) {
        while (true) {
            int v = readInt(prompt + " (" + min + "-" + max + "): ");
            if (v >= min && v <= max) return v;
            System.out.println("Value should be between " + min + " and " + max + ".");
        }
    }


    public static void close() {
        SC.close();
    }
}
