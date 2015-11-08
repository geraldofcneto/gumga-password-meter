package passwordmeter.rules;

/**
 * Created by geraldo on 08/11/15.
 */
public class MinimumNumberOfChars implements Rule, Requirement {
    private String s;

    public MinimumNumberOfChars(String s) {
        this.s = s;
    }

    @Override
    public Integer score() {
        return 0;
    }

    @Override
    public String description() {
        return "Minimum chars";
    }

    @Override
    public Boolean isMet() {
        return s.length() >= 8;
    }
}
