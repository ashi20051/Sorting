package CycleSortBasedQues;

import java.util.Arrays;
/*
    Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

    Example 1:
    Input: nums = [3,0,1]
    Output: 2
    Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

    Example 2:
    Input: nums = [0,1]
    Output: 2
    Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

    Example 3:
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
    Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

    Constraints:

    n == nums.length
    1 <= n <= 104
    0 <= nums[i] <= n
    All the numbers of nums are unique.

    Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?
    leetcode link: https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,2,1};
        int missingNumber = findMissingNumber(arr);
        System.out.println("The missing number is: "+missingNumber);
    }

    private static int findMissingNumber(int[] arr) {
        //we will be using counting sort as the numbers in arr are in range [0,n]
        //This solution has O(1) space, O(n) time complexity
        // example: [4,0,2,1] ==> sorted version = [0,1,2,3,4] ; element == index

        int index = 0;
        while(index < arr.length) {
            //check whether the index is correctIndex or not
            int correctIndex = arr[index];   // if we take the case when correctIndex = arr[i] - 1, then we need to ignore the zero
            if(correctIndex == arr.length) {
                index++;
                continue;
            }
            /*
            or we can find if correctIndex == -1, then index++
            if(correctIndex == -1) {
                index++;
                continue;
            }
             */
            if(arr[index] != arr[correctIndex] ) {
                swap(arr,index,correctIndex);
            } else index++;
        }
        System.out.println(Arrays.toString(arr));

        for(int i=0; i< arr.length; i++) {
            if(arr[i] != i) {
                return i;
            }
        }
        return arr.length;
        /*
        if we ignore thr case: correctIndex =-1, then
        for(int i=0; i< arr.length; i++) {
            if(arr[i] == 0) {
                return i+1;
            }
        }
        return 0;
         */
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
