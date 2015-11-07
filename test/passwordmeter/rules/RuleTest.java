package passwordmeter.rules;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class RuleTest {

    @Test
    public void testNumberOfChars_WithEmptyString_score0() throws Exception {
        MatcherAssert.assertThat(new NumberOfChars("").score(), is(0));
    }

    @Test
    public void testNumberOfChars_WithEmptyString_numberOfChars1() throws Exception {
        assertThat(new NumberOfChars("a").numberOfChars(), is(1));
    }

    @Test
    public void testNumberOfChars_WithOneChar_score4() throws Exception {
        assertThat(new NumberOfChars("a").score(), is(4));
    }

    @Test
    public void testLettersOnly_WithEmptyString_score0() throws Exception {
        assertThat(new LettersOnly("").score(), is(0));
    }

    @Test
    public void testLettersOnly_WithOneChar_scoreMinusOne() throws Exception {
        assertThat(new LettersOnly("a").score(), is(-1));
    }

    @Test
    public void testLettersOnly_WithTwoChar_scoreMinusTwo() throws Exception {
        assertThat(new LettersOnly("aa").score(), is(-2));
    }
}