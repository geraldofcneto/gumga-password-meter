package passwordmeter.rules;

/**
 * Created by geraldo on 07/11/15.
 */
public class Symbols extends RegexRule {

    public Symbols(String a) {
        super(a);
    }

    @Override
    String getRegex() {
        return "[^a-zA-Z0-9]";
    }

    @Override
    public String description() {
        return "Symbols";
    }

    @Override
    public Integer score() {
        return numberOfFoundChars()*6;
    }
}
