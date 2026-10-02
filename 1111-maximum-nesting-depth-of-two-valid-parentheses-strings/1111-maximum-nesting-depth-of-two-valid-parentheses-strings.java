class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int cur = 0;
        int res[] = new int[seq.length()];
        for(int i = 0; i < seq.length(); i++)
        {
            char c = seq.charAt(i);
            if(c == '(')
            {
                cur++;
                res[i] = cur % 2;
            }
            else
            {
                res[i] = cur % 2;
                cur--;
            }
        }
        return res;
    }
}