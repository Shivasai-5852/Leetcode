class Solution {
    public int longestSubsequence(int[] nums) {
        int zeroCount = 0;
        for(int num : nums)
        {
            if(num == 0)
            {
                zeroCount++;
            }
        }
        if(zeroCount == nums.length)
        {
            return 0;
        }
        int xor = 0;
        for(int num : nums)
        {
            xor ^= num;
        }
        if(xor != 0)
        {
            return nums.length;
        }
        return nums.length - 1;
    }
}