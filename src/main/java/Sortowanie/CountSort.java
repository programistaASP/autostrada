package Sortowanie;


import java.util.Arrays;
import java.util.Random;

public class CountSort {
    public static void countSort(int[] array, int k) {
        Random z = new Random();
        int[] counter = new int[k+1];
        for (int i = 0; i < counter.length; i++) {
            counter[i] = 0;
            System.out.println(counter[i]);
        }
        for(int i = 0; i<array.length; i++){
            counter[array[i]]++;
        }
        int index =0;
        for(int i = 0; i <counter.length; i++) {
            while (counter[i] > 0) {
                array[index] = i;
                index++;
                counter[i]--;
            }
        }
    }
}




