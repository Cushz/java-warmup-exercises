package Chapter3_4_5;

public class ParenthesisMatching {
    MyStack<Character> stack = new MyStack<Character>(40);
    private String formula;
    public ParenthesisMatching(String s)
    {
        this.formula = s;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }
    public static boolean bracketsAreMatching(char c1, char c2)
    {
        if (c1 == '(' && c2 == ')')
        {
            return true;
        }
        return false;
    }
    public boolean parse() throws MaxCapacityException, EmptyStackException {
        for (int i = 0; i < formula.length(); i++) {
            if (formula.charAt(i) == '(')
            {
                stack.push(formula.charAt(i));
            }
            else if (formula.charAt(i) == ')')
            {
                if (stack.isEmpty())
                {
                    System.out.println("PROBLEM");
                    return false;
                }
                if(bracketsAreMatching(stack.peek(), formula.charAt(i)))
                {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty())
        {
            return true;
        }
        return false;
    }

}
