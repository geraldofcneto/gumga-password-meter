package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 07/11/15.
 */
public class MiddleNumberOrSymbolTest {

    @Test
    public void testEmptyString() {
        assertThat(new MiddleNumberOrSymbol("").score(), is(0));
    }

    @Test
    public void testThreeSymbols() {
        assertThat(new MiddleNumberOrSymbol("***").score(), is(2));
    }

    @Test
    public void testFourSymbols() {
        assertThat(new MiddleNumberOrSymbol("****").score(), is(4));
    }
}