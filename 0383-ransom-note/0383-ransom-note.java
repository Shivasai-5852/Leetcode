class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        for(char c : magazine.toCharArray())
        {
            freq1[c - 'a']++;
        }
        for(char c : ransomNote.toCharArray())
        {
            if(freq1[c - 'a'] > 0)
            {
                freq1[c - 'a']--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}