class Solution {
    public int findGCD(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(int num : nums)
        {
            if(num > maxi)  maxi = num;
            if(num < mini)  mini = num;
        }
        return gcd(maxi, mini);
    }
    private int gcd(int a, int b)
    {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }
}