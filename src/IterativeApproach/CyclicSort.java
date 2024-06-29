package IterativeApproach;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] arr) {
        int i=0;
        while(i < arr.length) {
            //check whether this i is the correct index or not
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr,i,correctIndex);
            } else i++;
        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
