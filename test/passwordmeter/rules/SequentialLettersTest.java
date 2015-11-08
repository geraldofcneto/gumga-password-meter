package passwordmeter.rules;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class SequentialLettersTest {

    @Test
    public void testWithEmptyString(){
        assertThat(new SequentialLetters("").score(), is(0));
    }

    @Test
    public void testWith2CharsString(){
        assertThat(new SequentialLetters("ab").score(), is(0));
    }

    @Test
    public void testWith3CharsString(){
        assertThat(new SequentialLetters("abc").score(), is(-3));
    }

    @Test
    public void testWith2ConsecutiveGroups(){
        assertThat(new SequentialLetters("abcefg").score(), is(-6));
    }

    @Test
    public void testIntValue(){
        assertThat(SequentialLetters.intValue('a'), is(97));
        assertThat(SequentialLetters.intValue('b'), is(98));
        assertThat(SequentialLetters.intValue('`'), is(96));
    }

    @Test
    public void testCriteria(){
        assertThat(new SequentialLetters("abc").criteria().test('a'), is(true));
        assertThat(new SequentialLetters("abc").criteria().test('z'), is(true));
    }

    @Ignore
    @Test
    public void testWith3CharsOnLimitString(){
        assertThat(new SequentialLetters("`ab").score(), is(0));
    }

}