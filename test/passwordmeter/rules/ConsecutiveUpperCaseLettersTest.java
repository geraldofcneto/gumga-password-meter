package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class ConsecutiveUpperCaseLettersTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new ConsecutiveUpperCaseLetters("").score(), is(0));
    }

    @Test
    public void testWith1CharString(){
        assertThat(new ConsecutiveUpperCaseLetters("A").score(), is(0));
    }

    @Test
    public void testWith2UppercaseCharString(){
        assertThat(new ConsecutiveUpperCaseLetters("AA").score(), is(-2));
    }

    @Test
    public void testWith3UppercaseCharString(){
        assertThat(new ConsecutiveUpperCaseLetters("AAA").score(), is(-4));
    }

    @Test
    public void testWithNumberString(){
        assertThat(new ConsecutiveUpperCaseLetters("11").score(), is(0));
    }

    @Test
    public void testWithAlternatedCaseString(){
        assertThat(new ConsecutiveUpperCaseLetters("AaA").score(), is(0));
    }

}