package passwordmeter.rules;

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
        return 0;
    }

    @Override
    public String description() {
        return "Requirements";
    }
}
