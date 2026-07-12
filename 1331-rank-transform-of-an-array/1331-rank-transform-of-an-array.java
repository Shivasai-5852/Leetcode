class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++)
        {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int k = 1;
        for(int i = 0; i < temp.length; i++)
        {
            if(!map.containsKey(temp[i]))
            {
                map.put(temp[i], k);
                k++;
            }
        }
        int[] ans = new int[temp.length];
        for(int i = 0; i < ans.length; i++)
        {
            ans[i] = map.get(arr[i]);
        }
        return ans;
    }
}