class Solution {
    public int maxVowels(String s, int k) {
        int cnt = 0;
        int maxCnt = 0;
        int j = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                cnt++;
            }
            if(i - j + 1 > k)
            {
                if(s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u')
                {
                    cnt--;
                }
                j++;
            }
            if(i - j + 1 == k)
            {
                maxCnt = Math.max(cnt, maxCnt);
            }
        }
        return maxCnt;
    }
}