package org.example;

import java.util.ArrayList;
import java.util.List;

public class RefactoredRangeLister {
    public static List<Integer> makeRange(int min, int max) {
        List<Integer> range = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            range.add(i);
        }
        return range;
    }

    public static void main(String[] args) {
        List<Integer> range = makeRange(1, 10);
        System.out.println("The list: " + range);
    }
}
