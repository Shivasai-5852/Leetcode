class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int totalOnes = 0;
        int previousZero = Integer.MIN_VALUE;
        int maxGain = 0;
        int i = 0;
        int n = s.length();
        while(i < n)
        {
            int j = i;
            while(j < n && s.charAt(j) == s.charAt(i))
            {
                j++;
            }
            int len = j - i;
            if(s.charAt(i) == '1')
            {
                totalOnes += len;
            }
            else
            {
                maxGain = Math.max(maxGain, previousZero + len);
                previousZero = len;
            }
            i = j;
        }
        return totalOnes + maxGain;
    }
}