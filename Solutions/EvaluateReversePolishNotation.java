class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {

        if(tokens.length == 1)
        {
            return Integer.parseInt(tokens[0]);
        }

        Stack<Integer> operands = new Stack();
        HashSet<String> operators = new HashSet();
        operators.add("+");
        operators.add("-");
        operators.add("/");
        operators.add("*");
        int result = 0;
        for(String str : tokens)
        {
            if(!operators.contains(str))
            {
                operands.push(Integer.parseInt(str));
            }
            else
            {
                result = operate(str, operands.pop(), operands.pop());
                operands.push(result);
            }
        }

        return result;
    }

    //reverse because pop in reverse order
    private static int operate(String operator, int y, int x)
    {
        switch(operator){
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
            default:
             throw new RuntimeException("oops");
        }
    }
}