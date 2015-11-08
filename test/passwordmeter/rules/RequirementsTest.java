package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class RequirementsTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new Requirements("").score(), is(0));
    }

    @Test
    public void testWithAlphaString(){
        assertThat(new Requirements("a").score(), is(2));
    }

    @Test
    public void testWithAlphaNumericString(){
        assertThat(new Requirements("a1").score(), is(4));
    }

    @Test
    public void testWithMixedCaseAlphaNumericString(){
        assertThat(new Requirements("aA1").score(), is(6));
    }

    @Test
    public void testWithMixedCaseAlphaNumericStringWithSymbols(){
        assertThat(new Requirements("aA1!").score(), is(8));
    }

    @Test
    public void testWithLongMixedCaseAlphaNumericStringWithSymbols(){
        assertThat(new Requirements("abcABC1!").score(), is(10));
    }

}