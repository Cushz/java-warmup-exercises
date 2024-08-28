package Chapter3_4_5;

public class Product extends BinaryOperator {
    public Product(ArithmeticExpression x, ArithmeticExpression y)
    {
        super(x,y);
    }

    public double eval(double arg1, double arg2)
    {
        return arg1 * arg2;
    }

    public String label()
    {
        return "*";
    }

}