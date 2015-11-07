package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class UpperCaseLettersTest {

    @Test
    public void testUpperCaseLetters(){
        UpperCaseLetters upperCaseLetters = new UpperCaseLetters("AaBbCc");
        assertThat(upperCaseLetters.numberOfFoundChars(), is(3));
        assertThat(upperCaseLetters.score(), is(6));
    }

    @Test
    public void testNumberOfUpperCaseLetters_withEmptyString_score0() throws Exception {
        assertThat(new UpperCaseLetters("").score(), is(0));
    }

    @Test
    public void testNumberOfUpperCaseLetters_withoutUppercaseLetters_score0() throws Exception {
        UpperCaseLetters upperCaseLetters = new UpperCaseLetters("abcde12345!@#$~");
        assertThat(upperCaseLetters.numberOfFoundChars(), is(0));
        assertThat(upperCaseLetters.score(), is(30));
    }

}