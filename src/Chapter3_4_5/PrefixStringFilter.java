package Chapter3_4_5;

public class PrefixStringFilter implements StringFilter{
    private int n;
    public PrefixStringFilter(int n)
    {
        this.n = n;
    }
    @Override
    public String filter(String s)
    {
        // Check if n exceeds the length of the string
        if (n > s.length()) {
            n = s.length(); // Adjust n to be within bounds
        }

        String result = ""; // Initialize result as an empty string

        for (int i = 0; i < n; i++) {
            result = result.concat(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
