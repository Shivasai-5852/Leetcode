class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        int k = p.length();
        List<Integer> list = new ArrayList<>();
        for(char c : p.toCharArray())
        {
            arr1[c - 'a']++;
        }
        int left = 0;
        for(int right = 0; right < s.length(); right++)
        {
            arr2[s.charAt(right) - 'a']++;
            if(right - left + 1 > k)
            {
                arr2[s.charAt(left) - 'a']--;
                left++;
            }
            if(right - left + 1 == k)
            {
                if(Arrays.equals(arr1, arr2))
                {
                    list.add(left);
                }
            }
        }
        return list;
    }
}