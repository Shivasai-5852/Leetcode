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
        boolean[] present = new boolean[101];
        for(int num : nums)
        {
            present[num] = true;
        }
        for(int i = mini; i <= maxi; i++)
        {
            if(!present[i])
            {
                list.add(i);
            }
        }
        return list;
    }
}