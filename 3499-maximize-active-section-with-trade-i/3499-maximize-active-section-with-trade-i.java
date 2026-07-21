class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int activeCount = 0;
        for(char ch : s.toCharArray())
        {
            if(ch == '1')   activeCount++;
        }
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i < n)
        {
            if(s.charAt(i) == '0')
            {
                int start = i;
                while(i < n && s.charAt(i) == '0')  i++;
                int temp = i - start;
                list.add(temp);
            }
            else
            {
                i++;
            }
        }
        int ans = 0;
        for(int j = 1; j < list.size(); j++)
        {
            ans = Math.max(ans, list.get(j) + list.get(j - 1));
        }
        return ans + activeCount;
    }
}