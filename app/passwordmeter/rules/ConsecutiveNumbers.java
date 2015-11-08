package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class ConsecutiveNumbers extends ConsecutiveChars {

    public ConsecutiveNumbers(String s) {
        super(s);
    }

    @Override
    Predicate<Character> criteria() {
        return c -> Character.isDigit(c);
    }

    @Override
    public String description() {
        return "Consecutive Numbers";
    }
}
