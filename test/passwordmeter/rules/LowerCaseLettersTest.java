package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class LowerCaseLettersTest {

    @Test
    public void testIsMetWithEmptyString(){
        assertThat(new LowerCaseLetters("").isMet(), is(false));
    }

    @Test
    public void testIsMetWithNumericString(){
        assertThat(new LowerCaseLetters("1").isMet(), is(false));
    }

    @Test
    public void testIsMetWithAlphaString(){
        assertThat(new LowerCaseLetters("a").isMet(), is(true));
    }

    @Test
    public void testIsMetWithUppercaseAlphaString(){
        assertThat(new LowerCaseLetters("A").isMet(), is(false));
    }

    @Test
    public void testIsMetWithSymbolString(){
        assertThat(new LowerCaseLetters("@").isMet(), is(false));
    }

}