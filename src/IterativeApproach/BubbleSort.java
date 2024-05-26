package IterativeApproach;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static private void bubble(int[] a){
        boolean swapped=false;
        // run the steps n-1 times
        for(int i = 0; i < a.length; i++) {

            //for each step, max item will come at last respective index
            for(int j = 1; j < a.length - i; j++) {

                //swap if the previous item is greater than the item
                if(a[j-1] > a[j]) {
                    //swap items
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swapped for particular value of i, it means the array is already sorted, hence stop the program
            if(!swapped) break;
        }
    }
}
