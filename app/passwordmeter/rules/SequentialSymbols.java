package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialSymbols extends SequentialChars {

    public SequentialSymbols(String s) {
        super(s);
    }

    Predicate<Character> criteria(){
        return c -> !Character.isLetterOrDigit(c);
    }

    @Override
    public String description() {
        return "Sequential Symbols (3+)";
    }
}
