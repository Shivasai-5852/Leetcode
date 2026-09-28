class Solution {

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void quickSort(int[] nums, int low, int high) {

        if (low >= high)
            return;

        int pivot = nums[low];

        int i = low;
        int j = high;

        while (i <= j) {

            while (nums[i] < pivot)
                i++;

            while (nums[j] > pivot)
                j--;

            if (i <= j) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(nums, low, j);

        if (i < high)
            quickSort(nums, i, high);
    }
}