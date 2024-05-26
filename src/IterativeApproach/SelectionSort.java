package IterativeApproach;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-2, 0, -23, 1, 89, 34};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selection(int[] arr) {
        for(int i=0; i < arr.length; i++ ) {
            //find maximum element from remaining array and swap with correct index
            int lastIndex = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,lastIndex);
            //swap
            swap(arr,maxIndex,lastIndex);
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int maxIndex = start;
        for(int index=start; index <= end; index++) {
            if(arr[maxIndex]<arr[index]) {
                maxIndex = index;
            }
        }
        return maxIndex;
    }
}
