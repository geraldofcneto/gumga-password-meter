package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class RepeatedCharsTest {

    @Test
    public void testWithEmptyString() {
        assertThat(new RepeatedChars("").score(), is(0));
    }

    @Test
    public void testWith1RepeatedElementString() {
        assertThat(new RepeatedChars("aa").score(), is(-4));
    }

}