package CycleSortBasedQues;
/*
    Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
    There is only one repeated number in nums, return this repeated number.
    You must solve the problem without modifying the array nums and uses only constant extra space.

    Example 1:
    Input: nums = [1,3,4,2,2]
    Output: 2

    Example 2:
    Input: nums = [3,1,3,4,2]
    Output: 3

    Example 3:
    Input: nums = [3,3,3,3,3]
    Output: 3

    Constraints:
    1 <= n <= 105
    nums.length == n + 1
    1 <= nums[i] <= n
    All the integers in nums appear only once except for precisely one integer which appears two or more times.

    Follow up:

    How can we prove that at least one duplicate number must exist in nums?
    Can you solve the problem in linear runtime complexity?

    problem link: https://leetcode.com/problems/find-the-duplicate-number/description/
 */
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println("Duplicate Number is: "+ans);
    }

    private static int findDuplicate(int[] arr) {
        int index = 0;
        int ans = 1;
        while(index < arr.length) {
            int correctIndex = arr[index] - 1;
            if( arr[index] != arr[correctIndex] ) {
                swap(arr, index, correctIndex);
            } else index++;
        }
        
        //search the duplicate number
        for(int i=0; i< arr.length; i++) {
            if(i != arr[i]-1) {
                ans =  arr[i];
            }
        }
        
        return ans;
    }

    private static void swap(int[] arr, int index, int correctIndex) {
        int temp = arr[index];
        arr[index] = arr[correctIndex];
        arr[correctIndex] = temp;
    }

}
