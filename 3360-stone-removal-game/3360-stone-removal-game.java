class Solution {
    public boolean canAliceWin(int n) {
        int st = 10;
        while(st > 0)
        {
            if(st % 2 == 0 && n < st)
            {
                return false;
            }
            if(st % 2 == 1 && n < st)
            {
                return true;
            }
            n -= st;
            st--;
        }
        return false;
    }
}