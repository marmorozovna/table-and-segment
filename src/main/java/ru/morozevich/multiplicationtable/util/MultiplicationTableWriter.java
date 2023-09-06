package ru.morozevich.multiplicationtable.util;

public class MultiplicationTableWriter {
    public static void printMultiplicationTable() {
        for (int num1 = 2; num1 < 6; num1++) {
            for (int num2 = 2; num2 < 6; num2++)
                System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
        }
    }
}
