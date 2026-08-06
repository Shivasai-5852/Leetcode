class Solution {
    public int smallestNumber(int n, int t) {
        int prod = 1;
        for(int i = n; i <= n + 10; i++)
        {
            int temp = i;
            while(temp > 0)
            {
                prod *= temp % 10;
                temp = temp / 10;
            }
            if(prod % t == 0)
            {
                return i;
            }
            else
            {
                prod = 1;
            }
        }  
        return 0;  
    }
}