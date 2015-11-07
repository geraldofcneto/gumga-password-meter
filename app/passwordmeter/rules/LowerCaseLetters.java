package passwordmeter.rules;

/**
 * Created by geraldo on 07/11/15.
 */
public class LowerCaseLetters extends RegexRule {
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

}
