package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class ConsecutiveLowerCaseLetters  extends ConsecutiveChars{
    public ConsecutiveLowerCaseLetters(String s) {
        super(s);
    }

    @Override
    Predicate<Character> criteria() {
        return c -> Character.isLowerCase(c);
    }

    @Override
    public String description() {
        return "Consecutive UpperCase Letters";
    }
}
