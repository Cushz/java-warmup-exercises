package Chapter3_4_5;

public class Sum extends BinaryOperator {
    public Sum(ArithmeticExpression x, ArithmeticExpression y)
    {
        super(x,y);
    }
    @Override
    public double eval(double arg1, double arg2)
    {
        return arg1+arg2;
    }
    @Override
    public String label()
    {
        return "+";
    }
}