package ma.sorting;

import java.util.Random;

public class TestOfSorting {
    public static void main(String[] args) {
        Random r = new Random();
        int[] testArray = new int[50];
        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = r.nextInt(100);
        }
        TestOfSorting.printArray(testArray);
        long start = System.currentTimeMillis();
        BubbleSort.sort(testArray);
        System.out.println(System.currentTimeMillis() - start);
        TestOfSorting.printArray(testArray);
    }

    private static void printArray(int[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

}
