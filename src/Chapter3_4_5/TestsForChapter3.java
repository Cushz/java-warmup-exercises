package Chapter3_4_5;

public class TestsForChapter3 {
    public static String[] filter(String[] Strings, StringFilter filter)
    {
        for (int i = 0; i < Strings.length; i++) {
            Strings[i] = filter.filter(Strings[i]);
        }
        return Strings;
    }
}
