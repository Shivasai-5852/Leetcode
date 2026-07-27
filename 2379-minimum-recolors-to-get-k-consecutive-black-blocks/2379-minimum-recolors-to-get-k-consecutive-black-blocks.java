class Solution {
    public int minimumRecolors(String blocks, int k) {
        int ans = Integer.MAX_VALUE;
        int cnt = 0;
        int left = 0;
        for(int right = 0; right < blocks.length(); right++)
        {
            if(blocks.charAt(right) == 'W') cnt++;
            if(right - left + 1 > k)
            {
                if(blocks.charAt(left) == 'W')
                {
                    cnt--;
                }
                left++;
            }
            if(right - left + 1 == k)
            {
                ans = Math.min(ans, cnt);
            }
        }
        return ans;
    }
}