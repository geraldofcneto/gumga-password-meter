package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class NumbersTest {

    @Test
    public void testNumberWithEmptyString(){
        assertThat(new Numbers("").score(), is(0));
    }

    @Test
    public void testNumberWithAlphaString(){
        assertThat(new Numbers("abcABC").score(), is(0));
    }

    @Test
    public void testNumberWithAlphaNumericString(){
        assertThat(new Numbers("1abc2ABC").score(), is(8));
    }

    @Test
    public void testNumberWithNumericString(){
        assertThat(new Numbers("1abc2ABC").score(), is(8));
    }

    @Test
    public void testIsMetWithEmptyString(){
        assertThat(new Numbers("").isMet(), is(false));
    }

    @Test
    public void testIsMetWithNumericString(){
        assertThat(new Numbers("1").isMet(), is(true));
    }

    @Test
    public void testIsMetWithAlphaString(){
        assertThat(new Numbers("a").isMet(), is(false));
    }

    @Test
    public void testIsMetWithSymbolString(){
        assertThat(new Numbers("@").isMet(), is(false));
    }

}