package ru.morozevich.multiplicationtable._main;

import ru.morozevich.multiplicationtable.util.MultiplicationTableWriter;
import ru.morozevich.multiplicationtable.util.SegmentCalculator;

public class Main {
    public static void main(String[] args) {
        MultiplicationTableWriter.printMultiplicationTable();
        double length = SegmentCalculator.calculateSegment(2,4,4,5);
        System.out.println(length);
    }
}