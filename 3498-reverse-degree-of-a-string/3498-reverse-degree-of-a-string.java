class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        for(int i = 0;i < s.length(); i++)
        {
            int prod = 1;
            prod *= (i+1);
            char c = s.charAt(i);
            prod *= (123 - c);
            sum += prod;
        }
        return sum;
    }
}