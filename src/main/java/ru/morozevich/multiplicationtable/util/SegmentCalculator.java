package ru.morozevich.multiplicationtable.util;

public class SegmentCalculator {
    public static double calculateSegment(int x1, int y1, int x2, int y2) {
        double lengthSegment;
        return lengthSegment = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
