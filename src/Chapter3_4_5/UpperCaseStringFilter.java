package Chapter3_4_5;

public class UpperCaseStringFilter implements StringFilter{
    @Override
    public String filter(String s) {
        s = s.toUpperCase();
        return s;
    }
}
