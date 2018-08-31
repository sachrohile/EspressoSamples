package com.thesachlab.espressosamples.ui.main;

import com.thesachlab.espressosamples.R;

import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class SampleActivityTest {

    @Test
    public void logo_shouldHaveContentDescription(){
        onView(withId(R.id.imageView)).check(matches(withContentDescription(R.string.espresso_lib_image)));
    }


}