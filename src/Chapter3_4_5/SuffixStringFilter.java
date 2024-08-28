package Chapter3_4_5;

public class SuffixStringFilter implements StringFilter {

    private int n;

    public SuffixStringFilter(int n) {
        this.n = n;
    }

    @Override
    public String filter(String s) {
        // Ensure n does not exceed the length of the string
        if (n > s.length()) {
            n = s.length();
        }

        String result = ""; // Initialize result as an empty string

        // Start loop from the correct index to extract suffix
        for (int i = s.length() - n; i < s.length(); i++) {
            result = result.concat(String.valueOf(s.charAt(i)));
        }
        return result;
    }
}
