package Sortowanie;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        for(int j = 0; j< array.length;j++){
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]= temp;
                }
            }
        }
    }
}
