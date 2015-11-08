package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class NumbersOnlyTest {

    @Test
    public void testWithEmptyString() throws Exception {
        assertThat(new NumbersOnly("").score(), is(0));
    }

    @Test
    public void testWithOneNumber() throws Exception {
        assertThat(new NumbersOnly("1").score(), is(-1));
    }

    @Test
    public void testWithTwoNumbers() throws Exception {
        assertThat(new NumbersOnly("12").score(), is(-2));
    }

    @Test
    public void testWithCharAndNumber() throws Exception {
        assertThat(new NumbersOnly("a1").score(), is(0));
    }

    @Test
    public void testWithNumberAndSpaces() throws Exception {
        assertThat(new NumbersOnly("1 ").score(), is(0));
    }

    @Test
    public void testWithCharAndSpacesAndNumber() throws Exception {
        assertThat(new NumbersOnly("a 1").score(), is(0));
    }


}
