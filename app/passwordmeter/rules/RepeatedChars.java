package passwordmeter.rules;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
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
//        s.chars().collect(Collectors.groupingBy(Function.identity()));

        return 0;
    }

    @Override
    public String description() {
        return "Repeated Chars (case insensitive)";
    }
}
