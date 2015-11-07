package passwordmeter.rules;

import passwordmeter.rules.Rule;

/**
 * Created by geraldo on 07/11/15.
 */
public class NumberOfChars implements Rule {

    private String password;

    public NumberOfChars(String password) {
        this.password = password;
    }

    Integer numberOfChars(){
        return password.length();
    }

    public Integer score(){
        return numberOfChars() * 4;
    }
}
