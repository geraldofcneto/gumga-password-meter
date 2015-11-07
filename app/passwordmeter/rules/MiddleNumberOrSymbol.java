package passwordmeter.rules;

/**
 * Created by geraldo on 07/11/15.
 */
public class MiddleNumberOrSymbol extends RegexRule {

    public MiddleNumberOrSymbol(String a) {
        super(cropString(a));
    }

    private static String cropString (String origin){
        if (origin.length() <= 2)
            return "";
        return origin.substring(1, origin.length() - 1);
    }

    @Override
    String getRegex() {
        return "[^a-zA-Z]";
    }

    @Override
    public String description() {
        return "Middle Number or Symbol";
    }

    @Override
    public Integer score() {
        return numberOfFoundChars()*2;
    }
}
