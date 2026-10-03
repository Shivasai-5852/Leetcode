class Solution {
    public int longestValidParentheses(String s) {
        /*if(s.equals("")) return 0;
        int res = 0;
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                st.push(c);
            }
            if(c == ')' && !st.isEmpty())
            {
                char temp = st.pop();
                if(temp == '(')
                {
                    res += 2;
                }
            }
        }
        return res;*/
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int maxLength = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) == '(')
            {
                st.push(i);
            }
            else
            {
                st.pop();
                if(st.isEmpty())
                {
                    st.push(i);
                }
                else
                {
                    int len = i - st.peek();
                    maxLength = Math.max(maxLength, len);
                }
            }
        }
        return maxLength;
    }
}