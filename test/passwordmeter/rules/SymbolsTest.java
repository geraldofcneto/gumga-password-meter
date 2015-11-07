package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class SymbolsTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new Symbols("").score(), is(0));
    }

    @Test
    public void testWithAlphaString(){
        assertThat(new Symbols("abcABC").score(), is(0));
    }

    @Test
    public void testWithAlphaNumericString(){
        assertThat(new Symbols("1abc2ABC").score(), is(0));
    }

    @Test
    public void testWithNumericString(){
        assertThat(new Symbols("1abc2ABC").score(), is(0));
    }

    @Test
    public void testWithSymbolsString(){
        assertThat(new Symbols("+-.,!@#$%^&*();\\/|<>\"'").score(), is(132));
    }

}