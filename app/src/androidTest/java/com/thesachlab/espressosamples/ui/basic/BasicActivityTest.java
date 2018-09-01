package com.thesachlab.espressosamples.ui.basic;

import android.app.Instrumentation;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.thesachlab.espressosamples.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class BasicActivityTest {

    @Rule
    public ActivityTestRule<BasicActivity> mActivityRule =
            new ActivityTestRule<>(BasicActivity.class);

    @Test
    public void textView_should_have_text() {
        onView(withId(R.id.textView)).check(matches(withText(getResourceString(R.string.basic_test_case))));
    }

    @NonNull
    private String getResourceString(int resourceId) {
        Context targetContext= InstrumentationRegistry.getTargetContext();
        return targetContext.getResources().getString(resourceId);
    }

    @Test
    public void enterValueInTextView(){
        onView(withId(R.id.edtBasic)).perform(typeText("BasicText"));
    }

    @Test
    public void buttonWithTextAndClickEvent() {
        onView(withId(R.id.button)).check(matches(withText("Basic Click")));
        onView(withId(R.id.button)).perform(click());
    }

}