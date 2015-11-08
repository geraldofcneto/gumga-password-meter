package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialNumbers extends SequentialChars {

    public SequentialNumbers(String s) {
        super(s);
    }

    Predicate<Character> criteria(){
        return c -> Character.isDigit(c);
    }

    @Override
    public String description() {
        return "Sequential Numbers (3+)";
    }
}
