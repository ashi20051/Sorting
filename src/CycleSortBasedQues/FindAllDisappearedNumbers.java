package CycleSortBasedQues;

import java.util.ArrayList;
import java.util.List;
/*
    link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
    description: Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
    Example 1:
    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]

    Example 2:
    Input: nums = [1,1]
    Output: [2]

    Constraints:
    n == nums.length
    1 <= n <= 105
    1 <= nums[i] <= n

    Follow up: Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindAllDisappearedNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findAllDisappearedNumbers(arr);
        System.out.println("Disappeared Numbers are: "+ ans);
    }

    private static List<Integer> findAllDisappearedNumbers(int[] arr) {
        int index = 0;
       List<Integer> ans = new ArrayList<>();
        while(index < arr.length) {
            int correctIndex = arr[index] - 1;
            if(arr[index] != arr[correctIndex]) {
                swap(arr,index,correctIndex);
            } else index++;
        }

        for(int i=0; i<arr.length; i++) {
            if(i != arr[i]-1)
            {
                ans.add(i+1);
            }
        }

        return ans;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }


}
