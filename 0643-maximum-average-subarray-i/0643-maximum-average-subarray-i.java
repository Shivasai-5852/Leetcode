class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = Integer.MIN_VALUE;
        double sum = 0;
        int i = 0;
        int j = 0;
        for(i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            if(i - j + 1 > k)
            {
                sum -= nums[j];
                j++;
            }
            if(i - j + 1 == k)
            {
                ans = Math.max(ans, sum);
            }
        }
        return ans / k;
    }
}