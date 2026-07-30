class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        if(n <= 8)  return n;
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            if(i > 7 && i < 16)
            {
                int j = 2;
                cnt += j;
            }
            if(i > 15 && i < 24)
            {
                int j = 3;
                cnt += j;
            }
            if(i > 23)
            {
                int j = 4;
                cnt += j;
            }
        }
        return cnt + 8;
    }
}