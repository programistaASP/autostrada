package Sortowanie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayToSort = {3, 4, 8, 1, 5, 11, 25, 9, 8, 45};
        System.out.println("Count Sort");
        CountSort.countSort(arrayToSort, 101);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("Bubble Sort");
        BubbleSort.bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("Sellection Sort");
        SellectionSort.selectionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
