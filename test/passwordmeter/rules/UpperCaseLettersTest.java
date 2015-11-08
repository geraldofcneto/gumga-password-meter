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

    @Test
    public void testIsMetWithEmptyString(){
        assertThat(new UpperCaseLetters("").isMet(), is(false));
    }

    @Test
    public void testIsMetWithNumericString(){
        assertThat(new UpperCaseLetters("1").isMet(), is(false));
    }

    @Test
    public void testIsMetWithAlphaString(){
        assertThat(new UpperCaseLetters("a").isMet(), is(false));
    }

    @Test
    public void testIsMetWithUppercaseAlphaString(){
        assertThat(new UpperCaseLetters("A").isMet(), is(true));
    }

    @Test
    public void testIsMetWithSymbolString(){
        assertThat(new UpperCaseLetters("@").isMet(), is(false));
    }
}