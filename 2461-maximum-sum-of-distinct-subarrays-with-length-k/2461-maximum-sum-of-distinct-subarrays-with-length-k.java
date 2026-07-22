class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(i - j + 1 > k)
            {
                sum -= nums[j];
                map.put(nums[j], map.get(nums[j]) - 1);
                if(map.get(nums[j]) == 0)   map.remove(nums[j]);
                j++;
            }
            if(i - j + 1 == k && map.size() == k)
            {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}