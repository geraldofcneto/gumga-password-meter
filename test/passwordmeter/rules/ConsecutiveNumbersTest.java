package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class ConsecutiveNumbersTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new ConsecutiveNumbers("").score(), is(0));
    }

    @Test
    public void testWith1CharString(){
        assertThat(new ConsecutiveNumbers("2").score(), is(0));
    }

    @Test
    public void testWith2DigitsString(){
        assertThat(new ConsecutiveNumbers("22").score(), is(-2));
    }

    @Test
    public void testWith3DigitsString(){
        assertThat(new ConsecutiveNumbers("222").score(), is(-4));
    }

    @Test
    public void testWithAlphaString(){
        assertThat(new ConsecutiveNumbers("Aa").score(), is(0));
    }

    @Test
    public void testWithMixedString(){
        assertThat(new ConsecutiveNumbers("2a2").score(), is(0));
    }

}