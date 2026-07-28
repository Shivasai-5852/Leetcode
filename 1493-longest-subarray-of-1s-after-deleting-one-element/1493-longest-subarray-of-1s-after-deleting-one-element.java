class Solution {
    public int longestSubarray(int[] nums) {
        int cnt = 0;
        int ans = 0;
        int left = 0;
        for(int right = 0; right < nums.length; right++)
        {
            if(nums[right] == 0)    cnt++;
            while(cnt > 1)
            {
                if(nums[left] == 0)
                {
                    cnt--;
                }
                left++;
            }
            ans = Math.max(ans, right - left);
        }
        return ans;
    }
}