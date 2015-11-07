package passwordmeter.rules;

/**
 * Created by geraldo on 07/11/15.
 */
public class LettersOnly implements Rule{
    private String a;

    public LettersOnly(String a) {
        this.a = a;
    }

    @Override
    public Integer score() {
        return - a.length();
    }
}
