package org.example;

public class RangeLister {
    int[] makeRange(int min, int max) {
        int[] range = new int[(max - min) + 1];

        for (int i = 0; i < range.length; i++) {
            range[i] = min++;
        }

        return range;
    }

    public static void main(String[] args) {
        RangeLister lister = new RangeLister();
        int[] range = lister.makeRange(1, 10);

        System.out.print("The array: [ ");
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + " ");
        }
        System.out.println("]");
    }
}
