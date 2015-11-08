package passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geraldo on 07/11/15.
 */
public class UpperCaseLetters extends RegexRule implements Requirement {
    public UpperCaseLetters(String a) {
        super(a);
    }

    @Override
    String getRegex() {
        return "[A-Z]";
    }

    @Override
    public String description() {
        return "UpperCase Letters";
    }

    @Override
    public Boolean isMet() {
        return numberOfFoundChars() > 0;
    }
}
