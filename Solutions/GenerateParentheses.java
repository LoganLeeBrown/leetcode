class GenerateParentheses {
    private static List<String> solution = new ArrayList();

    public List<String> generateParenthesis(int n) {
        solution.clear();
        generate(0, 0, n);
        return solution;
    }

    private static Stack<Character> st = new Stack();

    private static void generate(int open, int close, int n)
    {
        if(open == close && close == n)
        {
            Iterator it = st.iterator();
            String str = "";
            while(it.hasNext())
            {
                str += it.next();
            }
            solution.add(str);
        }
        if(open < n)
        {
            st.push('(');
            generate(open + 1, close, n);
            st.pop();
        }
        if(close < open)
        {
            st.push(')');
            generate(open, close + 1, n);
            st.pop();
        }
    }
}

/*
*/