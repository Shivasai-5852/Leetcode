class Solution {
    public long sumAndMultiply(int n) {
        String s = String.valueOf(n);
        String temp = "";
        for(char c : s.toCharArray())
        {
            if(c != '0')
            {
                temp += c;
            }
        }
        if(temp.isEmpty())
        {
            return 0;
        }
        long l1 = Long.parseLong(temp);
        long l2 = 0;
        for(char c : temp.toCharArray())
        {
            l2 += c - '0';
        }
        return l1 * l2;
    }
}