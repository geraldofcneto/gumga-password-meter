package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class ConsecutiveLowerCaseLettersTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new ConsecutiveLowerCaseLetters("").score(), is(0));
    }

    @Test
    public void testWith1CharString(){
        assertThat(new ConsecutiveLowerCaseLetters("A").score(), is(0));
    }

    @Test
    public void testWith2LowercaseCharString(){
        assertThat(new ConsecutiveLowerCaseLetters("aa").score(), is(-2));
    }

    @Test
    public void testWith3LowercaseCharString(){
        assertThat(new ConsecutiveLowerCaseLetters("aaa").score(), is(-4));
    }

    @Test
    public void testWithNumberString(){
        assertThat(new ConsecutiveLowerCaseLetters("22").score(), is(0));
    }

    @Test
    public void testWithAlternatedCaseString(){
        assertThat(new ConsecutiveLowerCaseLetters("aAa").score(), is(0));
    }

}