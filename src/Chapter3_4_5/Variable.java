package Chapter3_4_5;

public class Variable implements ArithmeticExpression {
    private double number;
    private String name;
    public Variable(String name, double number)
    {
        this.name = name;
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void set(float number) {
        this.number = number;
    }

    @Override
    public String asString() {
        return name;
    }
    public double asValue()
    {
        return number;
    }

}
