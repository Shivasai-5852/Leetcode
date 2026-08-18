class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        int[] freq = new int[51];
        for (int num : nums) 
        {
            freq[num]++;
        }
        if (k == 1) 
        {
            for (int i = 50; i >= 0; i--) 
            {
                if (freq[i] == 1) 
                {
                    return i;
                }
            }
            return -1;
        }
        if (k == n) 
        {
            int max = 0;
            for (int num : nums) 
            {
                max = Math.max(max, num);
            }
            return max;
        }
        int ans = -1;
        if (freq[nums[0]] == 1) 
        {
            ans = Math.max(ans, nums[0]);
        }
        if (freq[nums[n - 1]] == 1) 
        {
            ans = Math.max(ans, nums[n - 1]);
        }
        return ans;
    }
}