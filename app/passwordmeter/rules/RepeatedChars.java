package passwordmeter.rules;

import java.io.ByteArrayInputStream;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by geraldo on 08/11/15.
 */
public class RepeatedChars implements Rule {
    private String s;

    public RepeatedChars(String s) {
        this.s = s.toLowerCase();
    }

    @Override
    public Integer score() {
        return -2 * repetitions();
    }

    private int repetitions() {
        char[] charArray = s.toCharArray();
        Map<Character, Integer> amount = new HashMap<>();
        for (int i = 0; i < charArray.length; i++) {
            if(!amount.containsKey(charArray[i]) )
                amount.put(charArray[i], 0);
            amount.put(charArray[i], amount.get(charArray[i]) + 1);
        }

        int repetitions = 0;
        for (Map.Entry<Character, Integer> c : amount.entrySet())
            if (c.getValue() > 1)
                repetitions += c.getValue();

        return repetitions;
    }

    @Override
    public String description() {
        return "Repeated Chars (case insensitive)";
    }
}
