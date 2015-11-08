package passwordmeter.rules;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by geraldo on 08/11/15.
 */
public class MinimumNumberOfCharsTest {

    @Test
    public void testIsMetWithEmptyString(){
        assertThat(new MinimumNumberOfChars("").isMet(), is(false));
    }

    @Test
    public void testIsMetWith7charString(){
        assertThat(new MinimumNumberOfChars("1234567").isMet(), is(false));
    }

    @Test
    public void testIsMetWith8charString(){
        assertThat(new MinimumNumberOfChars("12345678").isMet(), is(true));
    }

    @Test
    public void testIsMetWith9charString(){
        assertThat(new MinimumNumberOfChars("123456789").isMet(), is(true));
    }
}