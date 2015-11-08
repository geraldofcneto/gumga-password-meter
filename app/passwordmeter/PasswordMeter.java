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
        rules.add(new Numbers(password));
        rules.add(new Symbols(password));
        rules.add(new MiddleNumberOrSymbol(password));
        rules.add(new Requirements(password));

        rules.add(new LettersOnly(password));
        rules.add(new NumbersOnly(password));
        rules.add(new RepeatedChars(password));
        rules.add(new ConsecutiveUpperCaseLetters(password));
        rules.add(new ConsecutiveLowerCaseLetters(password));
        rules.add(new ConsecutiveNumbers(password));
        rules.add(new SequentialLetters(password));
        rules.add(new SequentialNumbers(password));
        rules.add(new SequentialSymbols(password));

    }

    public Integer score() {
        return rules.stream().mapToInt(Rule::score).sum();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (Rule r : rules) {
            sb.append(r.description() + ":" + r.score() +", ");
        }
        return sb.toString();
    }
}
