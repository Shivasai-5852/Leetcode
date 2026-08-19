class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int n1 = reservedSeats.length;
        for(int i = 0; i < n1; i++)
        {
            if(!map.containsKey(reservedSeats[i][0]))
            {
                map.put(reservedSeats[i][0], new HashSet<>());
            }
            map.get(reservedSeats[i][0]).add(reservedSeats[i][1]);
        }
        int ans = 0;
        for(Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet())
        {
            int cnt = 0;
            HashSet<Integer> list = entry.getValue();
            for(int j = 2; j <= 5; j++)
            {
                if(list.contains(j))
                {
                    cnt++;
                    break;
                }
            }
            if(cnt == 0)
            {
                ans++;
                for(int j = 6; j <= 9; j++)
                {
                    if(list.contains(j))
                    {
                        cnt++;
                        break;
                    }
                }
                if(cnt == 0)    ans++;
            }
            else
            {
                int c = cnt;
                for(int j = 4; j <= 7; j++)
                {
                    if(list.contains(j))
                    {
                        cnt++;
                        break;
                    }
                }
                if(cnt == c)    ans++;
                else
                {
                    int c2 = cnt;
                    for(int j = 6; j <= 9; j++)
                    {
                        if(list.contains(j))
                        {
                            cnt++;
                            break;
                        }
                    }
                    if(cnt == c2)   ans++;
                }
            }
        }
        ans += 2 * (n - map.size());
        return ans;
    }
}