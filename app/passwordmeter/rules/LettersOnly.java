package passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geraldo on 07/11/15.
 */
public class LettersOnly extends ExclusiveRegexRule{
    public LettersOnly(String s) {
        super(s);
    }

    @Override
    public String getRegex() {
        return "[a-zA-Z]+";
    }

    @Override
    public String description() {
        return "Letters Only";
    }
}
