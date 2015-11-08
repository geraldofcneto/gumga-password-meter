package passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geraldo on 07/11/15.
 */
public abstract class RegexRule implements Rule{

    private String s;
    private String regex;

    public RegexRule(String s){
        this.s = s;
    }

    @Override
    public Integer score() {
        return (s.length()-numberOfFoundChars())*2;
    }

    public Integer numberOfFoundChars() {
        Matcher matcher = Pattern.compile(getRegex()).matcher(s);

        int letters = 0;
        while (matcher.find())
            letters++;

        return letters;
    }

    abstract String getRegex();
}
