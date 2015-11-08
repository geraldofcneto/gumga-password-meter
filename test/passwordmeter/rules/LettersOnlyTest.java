package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class LettersOnlyTest {

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

    @Test
    public void testLettersOnly_WithTwoDifferentCasedChar_scoreMinusTwo() throws Exception {
        assertThat(new LettersOnly("aA").score(), is(-2));
    }

    @Test
    public void testLettersOnly_WithTwoCharAndNumber_score0() throws Exception {
        assertThat(new LettersOnly("aa1").score(), is(0));
    }

    @Test
    public void testLettersOnly_WithTwoCharAndSpaces_score0() throws Exception {
        assertThat(new LettersOnly("aa ").score(), is(0));
    }

    @Test
    public void testLettersOnly_WithTwoCharAndSpacesAndNumber_score0() throws Exception {
        assertThat(new LettersOnly("aa 1").score(), is(0));
    }

}