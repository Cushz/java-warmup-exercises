package Chapter3_4_5;

public class CompositeStringFilter implements StringFilter{
    StringFilter[] filters;
    public CompositeStringFilter (StringFilter[] filters)
    {
        this.filters = filters;
    }

    @Override
    public String filter(String s) {
        for (StringFilter i : filters)
        {
            System.out.println(i.filter(s));
        }
        return s;
    }
}
