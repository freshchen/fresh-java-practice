package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void case1() {
        String text = "This is the text to be searched " +
                "for occurrences of the http:// pattern.";
        String regex = ".*http://.*";
        boolean matches = Pattern.matches(regex, text);
        System.out.println("matches = " + matches);
    }

    public static void case2() {
        String text = "This is the text to be searched " +
                "for occurrences of the http:// pattern.";
        String regex = ".*https://.*";
        boolean matches = Pattern.matches(regex, text);
        System.out.println("matches = " + matches);
    }

    public static void case3() {
        String text = "This is the text to be searched " +
                "for occurrences of the http:// pattern.";
        String regex = "the";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }

    public static void main(String[] args) {
        Test.case1();
        Test.case2();
        Test.case3();
    }
}
