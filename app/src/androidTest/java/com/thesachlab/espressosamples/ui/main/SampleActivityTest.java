package com.thesachlab.espressosamples.ui.main;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.thesachlab.espressosamples.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class SampleActivityTest {
    @Rule
    public ActivityTestRule<SampleActivity> mActivityRule =
            new ActivityTestRule<>(SampleActivity.class);


    @Test
    public void logo_shouldHaveContentDescription(){
        onView(withId(R.id.imageView)).check(matches(withContentDescription(R.string.espresso_lib_image)));
    }



}