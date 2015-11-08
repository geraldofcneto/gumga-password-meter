package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialSymbolsTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new SequentialSymbols("").score(), is(0));
    }

    @Test
    public void testWith2CharsString(){
        assertThat(new SequentialSymbols(":;").score(), is(0));
    }

    @Test
    public void testWith3CharsString(){
        assertThat(new SequentialSymbols(":;<").score(), is(-3));
    }

    @Test
    public void testWith2ConsecutiveGroups(){
        assertThat(new SequentialSymbols(":;<>?@").score(), is(-6));
    }

    @Test
    public void testCriteria(){
        assertThat(new SequentialSymbols("").criteria().test('!'), is(true));
        assertThat(new SequentialSymbols("").criteria().test('@'), is(true));
    }

    @Test
    public void testWith3CharsOnLimitString(){
        assertThat(new SequentialSymbols("/01").score(), is(0));
    }

}