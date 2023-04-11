package com.example.bhavana.shopping_mall;

import android.content.Context;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private static final String FAKE_STRING = "Registration was successful";

    Context mMockContext;

    @Test
    public void readStringFromContext_LocalizedString() throws Exception{

       Registration myObjectUnderTest = new Registration(mMockContext);

        // ...when the string is returned from the object under test...
        String result = myObjectUnderTest.validate("sush@gmail.com","8500455026");

        // ...then the result should be the expected one.
        assertThat(result, is(FAKE_STRING));
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}