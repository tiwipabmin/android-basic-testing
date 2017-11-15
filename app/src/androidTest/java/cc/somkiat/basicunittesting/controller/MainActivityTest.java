package cc.somkiat.basicunittesting.controller;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import cc.somkiat.basicunittesting.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void saveSuccessful() {
        closeSoftKeyboard();
        onView(withId(R.id.userNameInput)).perform(replaceText("tiwipabmin"));
        onView(withId(R.id.emailInput)).perform(replaceText("tiwipabmin@gmail.com"));
        onView(withId(R.id.saveButton)).perform(click());
        onView(withText("Save successful")).check(matches(isDisplayed()));

    }

    @Test
    public void revertTest() {
        closeSoftKeyboard();
        onView(withId(R.id.revertButton)).perform(click());
        onView(withId(R.id.userNameInput)).check(matches(withText("")));
        onView(withId(R.id.emailInput)).check(matches(withText("")));
    }

}
