package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialLetters implements Rule {

    protected String s;

    public SequentialLetters(String s) {
        this.s = s;
    }

    @Override
    public Integer score() {
        return - sequentialChars() * 3;
    }

    protected int sequentialChars() {
        int sequential = 0;

        for (int i = 0; i < s.length(); i++)
            if (meetsCriteria(i))
                sequential++;

        return sequential;
    }

    boolean meetsCriteria(int charPosition) {
        if (charPosition < 2 || !criteria().test(s.charAt(charPosition)) || !criteria().test(s.charAt(charPosition -2 )))
            return false;
        return intValue(s.charAt(charPosition)) == intValue(s.charAt(charPosition-1)) + 1 &&
                intValue(s.charAt(charPosition)) == intValue(s.charAt(charPosition-2)) + 2;
    }

    public static int intValue(Character c) {
        return c + 0;
    }

    Predicate<Character> criteria(){
        return c -> Character.isAlphabetic(c);
    }

    @Override
    public String description() {
        return "Sequential Letters (3+)";
    }
}
