package com.example.topup;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)

public class TopupDetailsActivityEspressoTest {


    @Rule
    public ActivityTestRule<TopupDetailsActivity> mActivityRule =
            new ActivityTestRule<>(TopupDetailsActivity.class);

    @Test
    public void ensureTextChangesWork() {
        // Type text and then press the button.
        onView(withId(R.id.numberInput))
                .perform(typeText("HELLO"), closeSoftKeyboard());
        onView(withId(R.id.arrow)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.numberInput)).check(matches(withText("01620011019")));
    }


    @Test
    public void changeText_newActivity() {
        // Type text and then press the button.
        onView(withId(R.id.numberInput)).perform(typeText("01620011019"),
                closeSoftKeyboard());
        onView(withId(R.id.arrow)).perform(click());

        // This view is in a different Activity, no need to tell Espresso.
        onView(withId(R.id.catchNum)).check(matches(withText("01620011019")));
    }
}
