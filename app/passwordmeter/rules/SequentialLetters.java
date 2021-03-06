package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialLetters extends SequentialChars {

    public SequentialLetters(String s) {
        super(s);
    }

    Predicate<Character> criteria(){
        return c -> Character.isAlphabetic(c);
    }

    @Override
    public String description() {
        return "Sequential Letters (3+)";
    }
}
