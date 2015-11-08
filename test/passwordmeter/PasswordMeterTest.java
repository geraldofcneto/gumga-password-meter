package passwordmeter;

import org.junit.Ignore;
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

//    @Ignore
    @Test
    public void testScoreWithOneLetter () {
        PasswordMeter passwordMeter = new PasswordMeter("a");
//        assertThat(passwordMeter.toString(), is(""));
        assertThat(passwordMeter.score(), is(3));
        /*
        * to be 3, the sum should be delayed until 3 criterias are meet, but the string "aA" is accepted.
        * Why?
        * Think about it.
        *
        * */
    }

    @Test
    public void testScoreWithComplexString () {
        assertThat(new PasswordMeter("aSdF13*(").score(), is(90));
    }


    @Test
    public void testScoreWithSequentialString () {
        PasswordMeter passwordMeter = new PasswordMeter("123456789");

//        assertThat(passwordMeter.score(), is(4));

        assertThat(passwordMeter.toString(), is(""));
    }

}