class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        for(char ch : num.toCharArray())
        {
            while(!st.isEmpty() && k > 0 && st.peek() > ch)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k > 0)
        {
            st.pop();
            k--;
        }
        StringBuilder s = new StringBuilder();
        for(char ch : st)
        {
            s.append(ch);
        }
        while(s.length() > 0 && s.charAt(0) == '0')
        {
            s.deleteCharAt(0);
        }
        if(s.length() == 0)
        {
            return "0";
        }
        return s.toString();
    }
}