package passwordmeter.rules;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by geraldo on 07/11/15.
 */
public class Requirements implements Rule{

    private String s;

    public Requirements(String s) {
        this.s = s;
    }

    @Override
    public Integer score() {
        List<Requirement> rules = new ArrayList<>();
        rules.add(new Numbers(s));
        rules.add(new LowerCaseLetters(s));
        rules.add(new UpperCaseLetters(s));
        rules.add(new Symbols(s));
        rules.add(new MinimumNumberOfChars(s));

        return (int) rules.stream().filter(Requirement::isMet).count() * 2;
    }

    @Override
    public String description() {
        return "Requirements";
    }

}
