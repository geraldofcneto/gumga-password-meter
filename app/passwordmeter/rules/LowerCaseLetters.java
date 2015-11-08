package passwordmeter.rules;

/**
 * Created by geraldo on 07/11/15.
 */
public class LowerCaseLetters extends RegexRule implements Requirement {
    public LowerCaseLetters(String a) {
        super(a);
    }

    @Override
    String getRegex() {
        return "[a-z]";
    }

    @Override
    public String description() {
        return "Lowercase Letters";
    }

    @Override
    public Boolean isMet() {
        return numberOfFoundChars() > 0;
    }
}
