package com.example.topup;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static androidx.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Created by Khairub Nahar on 22,March,2020
 **/


@RunWith(AndroidJUnit4.class)
public class TopupWorkIsStarted {




    @Rule
    public ActivityTestRule<TopupDetailsActivity> dActivityRule = new ActivityTestRule<>(TopupDetailsActivity.class);

    @Test
    public void validateWorkActivity() {


        // check that the button is there


        onView(withId(R.id.arrow)).check(matches(notNullValue() ));
        onView(withId(R.id.arrow)).check(matches(withText("Start new activity")));
        onView(withId(R.id.arrow)).perform(click());


        intended(toPackage("com.example.topup"));
        intended(hasExtra("message", "01620011019"));

    }
}
