package Chapter3_4_5;

public abstract class BinaryOperator implements ArithmeticExpression {
    protected ArithmeticExpression x;
    protected ArithmeticExpression y;
    public BinaryOperator(ArithmeticExpression x, ArithmeticExpression y)
    {
        this.x = x;
        this.y = y;
    }
    @Override
    public String asString()
    {
        return "("+x.asString() + label() + y.asString()+")";
    }
    public double asValue()
    {
        return eval(x.asValue(),y.asValue());
    }
    protected abstract double eval(double arg1, double arg2);
    protected abstract String label();
}
