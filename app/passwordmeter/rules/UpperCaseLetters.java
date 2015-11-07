package passwordmeter.rules;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by geraldo on 07/11/15.
 */
public class UpperCaseLetters implements Rule{

    private String a;
    private String regex;

    public UpperCaseLetters(String a){
        this.a = a;
    }

    @Override
    public Integer score() {
        return numberOfUpperCaseLetters();
    }

    public Integer numberOfUpperCaseLetters() {
        return upperCaseLettersDirect();
    }

    public String upperCaseLetters() {
        regex = "[A-Z]";
        Matcher matcher = Pattern.compile(regex).matcher(a);

        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find())
            stringBuffer.append(matcher.group());

        return stringBuffer.toString();
    }

    public Integer upperCaseLettersDirect() {
        Matcher matcher = Pattern.compile("[A-Z]").matcher(a);

        int letters = 0;
        while (matcher.find())
            letters++;

        return letters;
    }
}
