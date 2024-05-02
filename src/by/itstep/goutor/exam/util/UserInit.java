package by.itstep.goutor.exam.util;

import by.itstep.goutor.exam.view.Printer;

import java.util.Scanner;

public class UserInit {
    public static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static int getMarkNumber() {
        Printer.printer("Enter count of mark: ");
        return SCANNER.nextInt();
    }

    public static int[] getAllMark() {
        int count = getMarkNumber();
        int[] marks = new int[count];
        for (int i = 0; i < marks.length; i++) {
            System.out.println("enter mark " + (i + 1) + ":");
            marks[i] = SCANNER.nextInt();
        }
        return marks;
    }

}
