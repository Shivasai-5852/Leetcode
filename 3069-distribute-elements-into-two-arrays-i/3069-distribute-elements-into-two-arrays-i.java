class Solution {
    public int[] resultArray(int[] nums) {
        if(nums.length < 3)
        {
            return nums;
        }
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int k = 2; k < nums.length; k++)
        {
            if(l1.get(l1.size() - 1) > l2.get(l2.size() - 1))
            {
                l1.add(nums[k]);
            }
            else
            {
                l2.add(nums[k]);
            }
        }
        int i = 0;
        for(int num : l1)
        {
            nums[i] = num;
            i++;
        }
        for(int num : l2)
        {
            nums[i] = num;
            i++;
        }
        return nums;
    }
}