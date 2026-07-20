class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        k = k % (m * n);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < m; i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < n; j++)
            {
                list.add(0);
            }
            ans.add(list);
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                int idx = i * n + j;
                int newIdx = (idx + k) % (m * n);
                int nr = newIdx / n;
                int nc = newIdx % n;
                ans.get(nr).set(nc, grid[i][j]);
            }
        }
        return ans;
    }
}