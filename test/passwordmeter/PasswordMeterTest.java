package passwordmeter;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class PasswordMeterTest {

    @Test
    public void testScoreWithEmptyString_score0() throws Exception {
        assertThat(new PasswordMeter("").score(), is(0));
    }

    @Test
    public void testScoreWithOneLetter () {
        assertThat(new PasswordMeter("a").score(), is(3));
    }

    @Test
    public void testScoreWithComplexString () {
        assertThat(new PasswordMeter("aA").score(), is(10));
    }

}