package Sortowanie;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]arrayToSort = {3,4,8,1,5};
        BubbleSort.bubbleSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
