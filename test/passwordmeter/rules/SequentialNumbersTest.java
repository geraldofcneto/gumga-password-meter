package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialNumbersTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new SequentialNumbers("").score(), is(0));
    }

    @Test
    public void testWith2CharsString(){
        assertThat(new SequentialNumbers("12").score(), is(0));
    }

    @Test
    public void testWith3CharsString(){
        assertThat(new SequentialNumbers("123").score(), is(-3));
    }

    @Test
    public void testWith2ConsecutiveGroups(){
        assertThat(new SequentialNumbers("123789").score(), is(-6));
    }

    @Test
    public void testCriteria(){
        assertThat(new SequentialNumbers("").criteria().test('0'), is(true));
        assertThat(new SequentialNumbers("").criteria().test('9'), is(true));
    }

    @Test
    public void testWith3CharsOnLimitString(){
        assertThat(new SequentialLetters("/01").score(), is(0));
    }

}