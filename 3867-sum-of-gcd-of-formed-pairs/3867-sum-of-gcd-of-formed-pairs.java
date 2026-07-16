class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int maxi = nums[0];
        for(int i = 0; i < n; i++)
        {
            if(i == 0)
            {
                arr[i] = nums[i];
                continue;
            }
            maxi = Math.max(maxi, nums[i]);
            arr[i] = gcd(maxi, nums[i]);
        }
        Arrays.sort(arr);
        long sum = 0;
        int i = 0;
        int j = n - 1;
        while(i < j)
        {
            if(i == j)
            {
                break;
            }
            sum += gcd(arr[i], arr[j]);
            i++;
            j--;
        }
        return sum;
    }
    private int gcd(int a, int b)
    {
        if(b == 0)  return a;
        return gcd(b, a % b);
    }
}