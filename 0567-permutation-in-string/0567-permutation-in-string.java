class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        if(m > n)   return false;
        int[] freq1 = new int[26];
        for(char c : s1.toCharArray())
        {
            freq1[c - 'a']++;
        }
        int left = 0;
        for(int right = m - 1; right < n; right++)
        {
            String st = s2.substring(left, right + 1);
            boolean temp = isTrue(st, freq1);
            if(temp)
            {
                return true;
            }
            else
            {
                left++;
            }
        }
        return false;
    }
    private boolean isTrue(String s, int[] freq1)
    {
        int[] freq2 = new int[26];
        for(char c : s.toCharArray())
        {
            freq2[c - 'a']++;
        }
        return Arrays.equals(freq1, freq2);
    }
}