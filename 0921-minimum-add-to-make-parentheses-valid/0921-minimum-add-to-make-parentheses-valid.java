class Solution {
    public int minAddToMakeValid(String s) {
        int o = 0;
        int cnt = 0;
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                o++;
            }
            else if(o > 0)
            {
                o--;
            }
            else
            {
                cnt++;
            }
        }
        return o + cnt;
    }
}