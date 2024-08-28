package Chapter3_4_5;

public class LowerCaseStringFilter implements StringFilter{
    @Override
    public String filter(String s)
    {
        return s.toLowerCase();
    }
}
