package passwordmeter.rules;

/**
 * Created by geraldo on 07/11/15.
 */
public class Numbers extends RegexRule implements Requirement {

    public Numbers(String a) {
        super(a);
    }

    @Override
    String getRegex() {
        return "[0-9]";
    }

    @Override
    public String description() {
        return "Numbers";
    }

    @Override
    public Integer score() {
        return numberOfFoundChars()*4;
    }

    @Override
    public Boolean isMet() {
        return numberOfFoundChars() > 0;
    }
}
