class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray())
        {
            freq[c - 'a']++;
        }
        StringBuilder str = new StringBuilder();
        String odd = "";
        for(int i = 0; i < 26; i++)
        {
            if(freq[i] == 0)
            {
                continue;
            }
            int a = freq[i] / 2;
            if(freq[i] % 2 != 0)
            {
                odd = String.valueOf((char)(i + 'a'));
            }
            for(int j = 0; j < a; j++)
            {
                str.append((char)(i + 'a'));
            }
        }
        String rev = new StringBuilder(str).reverse().toString();
        str.append(odd);
        str.append(rev);
        return str.toString();
    }
}