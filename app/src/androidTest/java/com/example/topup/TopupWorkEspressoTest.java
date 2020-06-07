package com.example.topup;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by Khairub Nahar on 22,March,2020
 **/


@RunWith(AndroidJUnit4.class)
public class TopupWorkEspressoTest {

    @Rule
    public ActivityTestRule<TopupWorkActivity> wActivityRule =
            new ActivityTestRule<>(TopupWorkActivity.class);


    @Test
    public void buttonShouldUpdateText(){
        onView(withId(R.id.arrow)).perform(click());
        onView(withId(R.id.catchNum)).check(matches(withText("01620011019")));
    }




    @Test
    public void buttonShouldUpdate(){
        onView(withId(R.id.imageView)).perform(click());
        onView(withId(R.id.imageView))
                .check(matches(withText(("Topup Successful"))));
    }


    @Test
    public void prebuttonShouldUpdate(){
        onView(withId(R.id.prepaid)).perform(click());

    }

    @Test
    public void postbuttonShouldUpdate(){
        onView(withId(R.id.postpaid)).perform(click());

    }
}
