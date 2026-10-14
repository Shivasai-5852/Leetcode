class Solution {
    public String maxSumOfSquares(int num, int sum) {
        while(sum > 9 * num)
        {
            return "";
        }
        StringBuilder s = new StringBuilder();
        while(sum >= 9)
        {
            s.append('9');
            sum -= 9;
        }
        if(sum > 0)
        {
            s.append(sum);
        }
        while(s.length() < num)
        {
            s.append('0');
        }
        return s.toString();
    }
}