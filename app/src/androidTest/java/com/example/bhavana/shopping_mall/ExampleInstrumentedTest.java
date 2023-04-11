package com.example.bhavana.shopping_mall;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test


    public void changeText_sameActivity() {
        // Type text and then press the button.
        onView(withId(R.id.edittext1))
                .perform(typeText("user"), closeSoftKeyboard());
        onView(withId(R.id.edittext2))
                .perform(typeText("pass"), closeSoftKeyboard());
        onView(withId(R.id.login)).perform(click());

        // Check that the text was changed.

    }
}


