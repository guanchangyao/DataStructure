package sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = new int[]{6, 8, 3, 5, 4, 2, 9, 1, 10, 7};

        quickSort(nums, 0, nums.length - 1);
        for (int sort : nums) {
            System.out.print(sort + " ");
        }
    }
    /**
     * 快速排序
     * @param nums 要排序的数据
     * @param left 排序起始位置
     * @param right 排序结束位置
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
