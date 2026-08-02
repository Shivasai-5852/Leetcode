class Solution {
    public long maxPairStrength(int[] nums) {
        int n = nums.length;
        long val = 0;
        long ans = Long.MIN_VALUE;
        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int temp = gcd(nums[i], nums[j]);
                long square = 1L * temp * temp;
                long prod = 1L * nums[i] * nums[j];
                val = prod / square;
                ans = Math.max(ans, val);
            }
        }
        return ans;
    }
    private int gcd(int a, int b)
    {
        while(b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}