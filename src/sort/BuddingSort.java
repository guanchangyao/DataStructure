package sort;

/**
 *冒泡排序
 */
public class BuddingSort {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 8, 3, 5, 4, 2, 9, 1, 10, 7};
        buddingSort(nums);
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
}
