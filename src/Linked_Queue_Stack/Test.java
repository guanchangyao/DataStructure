package Linked_Queue_Stack;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 8, 3, 5, 4, 2, 9, 1, 10, 7};
        //buddingSort(sorts);
        quickSort(nums, 0, nums.length - 1);
        for (int sort : nums) {
            System.out.print(sort + " ");
        }
    }

    /**
     * 冒泡排序
     *
     * @param nums 要排序的数组
     */
    public static void buddingSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     * @param nums
     * @param left
     * @param right
     */
    public static void quickSort(int[] nums, int left, int right) {
        if (left > right) return;
        int originLeft = left;
        int originRight = right;
        int baseNumber = nums[left];
        while (left != right) {
            while (baseNumber < nums[right] && left < right) {
                right--;
            }
            while (baseNumber >= nums[left] && left < right) {
                left++;
            }
            swap(nums, left, right);
        }
        swap(nums, originLeft, left);
        quickSort(nums, originLeft, left - 1);
        quickSort(nums, left + 1, originRight);
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}