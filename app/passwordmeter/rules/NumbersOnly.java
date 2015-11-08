package passwordmeter.rules;

/**
 * Created by geraldo on 08/11/15.
 */
public class NumbersOnly extends ExclusiveRegexRule {
    public NumbersOnly(String s) {
        super(s);
    }

    @Override
    String getRegex() {
        return "[0-9]+";
    }

    @Override
    public String description() {
        return "Numbers Only";
    }
}
