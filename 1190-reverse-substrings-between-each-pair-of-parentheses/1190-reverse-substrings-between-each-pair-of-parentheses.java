class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        String curr = "";
        for(char c : s.toCharArray())
        {
            if(c == '(')
            {
                st.push(curr);
                curr = "";
            }
            else if(c == ')')
            {
                String reversed = new StringBuilder(curr).reverse().toString();
                curr = reversed;
                String prev = st.pop();
                curr = prev + curr;
            }
            else
            {
                curr += String.valueOf(c);
            }
        }
        return curr;
    }
}