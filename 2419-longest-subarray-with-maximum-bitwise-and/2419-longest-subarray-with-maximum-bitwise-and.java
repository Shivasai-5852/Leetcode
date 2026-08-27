class Solution {
    public int longestSubarray(int[] nums) {
        int cnt = 0;
        int ans = 0;
        int maxi = Integer.MIN_VALUE;
        for(int num : nums)
        {
            maxi = Math.max(maxi, num);
        }
        for(int num : nums)
        {
            if(num == maxi)
            {
                cnt++;
            }
            else
            {
                cnt = 0;
            }
            ans = Math.max(cnt, ans);
        }
        return ans;
    }
}