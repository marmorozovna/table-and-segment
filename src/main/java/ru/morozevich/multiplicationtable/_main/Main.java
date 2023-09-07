package ru.morozevich.multiplicationtable._main;

import ru.morozevich.multiplicationtable.util.MultiplicationTableWriter;
import ru.morozevich.multiplicationtable.util.SegmentCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MultiplicationTableWriter.printMultiplicationTable();
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите координаты начала отрезка по осям x,y:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Введите координаты конца отрезка по осям x,y:");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double length = SegmentCalculator.calculateSegment(x1,y1,x2,y2);
        System.out.println("Длина отрезка по заданным координатам: "+length);
    }
}