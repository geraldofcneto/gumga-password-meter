package passwordmeter;

import passwordmeter.rules.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geraldo on 07/11/15.
 */
public class PasswordMeter {

    private List<Rule> rules = new ArrayList<>();

    private String password;

    public PasswordMeter(String password) {
        this.password = password;
        rules.add(new NumberOfChars(password));
        rules.add(new UpperCaseLetters(password));
        rules.add(new LowerCaseLetters(password));
        rules.add(new LettersOnly(password));
    }

    public Integer score() {
        return rules.stream().mapToInt(Rule::score).sum();
    }
}
