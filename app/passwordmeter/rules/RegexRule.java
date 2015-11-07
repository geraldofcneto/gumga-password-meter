package passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geraldo on 07/11/15.
 */
public abstract class RegexRule implements Rule{

    private String a;
    private String regex;

    public RegexRule(String a){
        this.a = a;
    }

    @Override
    public Integer score() {
        return (a.length()-numberOfFoundChars())*2;
    }

    public Integer numberOfFoundChars() {
        Matcher matcher = Pattern.compile(getRegex()).matcher(a);

        int letters = 0;
        while (matcher.find())
            letters++;

        return letters;
    }

    abstract String getRegex();
}
