class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for(int num : nums)
        {
            maxi = Math.max(maxi, num);
        } 
        int[] freq = new int[maxi + 1];
        for(int num : nums)
        {
            freq[num]++;
        }
        for(int i = 0; i < freq.length; i++)
        {
            if(freq[i] == 2)
            {
                list.add(i);
            }
        }
        return list;
    }
}