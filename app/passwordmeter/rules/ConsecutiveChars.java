package passwordmeter.rules;

import java.util.function.Predicate;

/**
 * Created by geraldo on 08/11/15.
 */
public abstract class ConsecutiveChars implements Rule {
    String s;

    public ConsecutiveChars(String s){
        this.s = s;
    }

    @Override
    public Integer score() {
        return -numberOfConsecutives()*2;
    }

    Integer numberOfConsecutives() {
        int consecutive = 0;

        for (int i = 0; i < s.length(); i++)
            if (meetsCriteria(i))
                consecutive++;

        return consecutive;
    }

    boolean meetsCriteria(int charPosition) {
        if (charPosition==0)
            return false;
        return criteria().test(s.charAt(charPosition)) && criteria().test(s.charAt(charPosition-1));
    }

    abstract Predicate<Character> criteria();

}
