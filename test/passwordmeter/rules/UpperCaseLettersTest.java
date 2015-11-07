package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class UpperCaseLettersTest {

    @Test
    public void testNumberOfUpperCaseLetters() throws Exception {
        assertThat(new UpperCaseLetters("AaBbCc").numberOfUpperCaseLetters(), is(3));
    }

    @Test
    public void testUpperCaseLetters(){
        UpperCaseLetters upperCaseLetters = new UpperCaseLetters("AaBbCc");
        assertThat(upperCaseLetters.upperCaseLetters(), is("ABC"));
        assertThat(upperCaseLetters.score(), is(3));
    }

    @Test
    public void testNumberOfUpperCaseLetters_withEmptyString_score0() throws Exception {
        assertThat(new UpperCaseLetters("").score(), is(0));
    }

    @Test
    public void testNumberOfUpperCaseLetters_withoutUppercaseLetters_score0() throws Exception {
        UpperCaseLetters upperCaseLetters = new UpperCaseLetters("abcde123456!@#$");
        assertThat(upperCaseLetters.upperCaseLetters(), is(""));
        assertThat(upperCaseLetters.score(), is(0));
    }

}