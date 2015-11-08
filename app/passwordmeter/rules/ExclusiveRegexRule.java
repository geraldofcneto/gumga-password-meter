package passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geraldo on 08/11/15.
 */
public abstract class ExclusiveRegexRule implements Rule {
    private String s;

    public ExclusiveRegexRule(String s) {
        this.s = s;
    }

    @Override
    public Integer score() {
        Matcher matcher = Pattern.compile(getRegex()).matcher(s);

        if (matcher.matches())
            return - s.length();
        return 0;
    }

    abstract String getRegex();
}
