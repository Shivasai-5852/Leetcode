class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int num : nums)
        {
            mini = Math.min(mini, num);
            maxi = Math.max(maxi, num);
        }
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[101];
        for(int num : nums)
        {
            freq[num]++;
        }
        for(int i = mini; i <= maxi; i++)
        {
            if(freq[i] == 0)
            {
                list.add(i);
            }
        }
        return list;
    }
}