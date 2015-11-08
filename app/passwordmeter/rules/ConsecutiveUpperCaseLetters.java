package passwordmeter.rules;

import sun.plugin.dom.css.CSSRule;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public class ConsecutiveUpperCaseLetters extends ConsecutiveChars {

    public ConsecutiveUpperCaseLetters(String s){
        super(s);
    }

    @Override
    Predicate<Character> criteria() {
        return c -> Character.isUpperCase(c);
    }

    @Override
    public String description() {
        return "Consecutive UpperCase Letters";
    }

}
