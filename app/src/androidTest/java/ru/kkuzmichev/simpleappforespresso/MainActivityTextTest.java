package ru.kkuzmichev.simpleappforespresso;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.intent.Intents.intended;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static androidx.test.espresso.intent.matcher.IntentMatchers.hasData;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.CoreMatchers.allOf;

import android.content.Intent;
import android.net.Uri;

import androidx.appcompat.widget.AppCompatImageButton;
import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.intent.Intents;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class MainActivityTextTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void registerIdlingResources() {
        IdlingRegistry.getInstance().register(EspressoIdlingResources.idlingResource);
    }

    @After
    public void unregisterIdlingResources() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResources.idlingResource);
    }

    @Test
    public void mainActivityTextTest() {
        String expected = "This is home fragment";

        ViewInteraction textView = onView(withId(R.id.text_home));
        textView.check(matches(isDisplayed()));
        textView.check(matches(withText(expected)));
    }

    @Test
    public void openSettingsTest() {
        Intents.init();

        ViewInteraction moreOptionsButton = onView(withContentDescription("More options"));
        moreOptionsButton.check(matches(isDisplayed()));
        moreOptionsButton.perform(click());

        ViewInteraction settingsButton = onView(withId(R.id.content));
        settingsButton.check(matches(isDisplayed()));
        settingsButton.perform(click());

        intended(hasAction(Intent.ACTION_VIEW));
        intended(hasData(Uri.parse("https://google.com")));

        Intents.release();
    }

    @Test
    public void openGalleryTest() {
        ViewInteraction menu = onView(isAssignableFrom(AppCompatImageButton.class));
        menu.check(matches(isDisplayed()));
        menu.perform(click());

        ViewInteraction gallery = onView(withId(R.id.nav_gallery));
        gallery.check(matches(isDisplayed()));
        gallery.perform(click());

        ViewInteraction itemSeven = onView(allOf(withId(R.id.item_number), withText("7")));
        itemSeven.check(matches(withText("7")));

        ViewInteraction recycleView = onView(withId(R.id.recycle_view));
        recycleView.check(matches(isDisplayed()));
        recycleView.check(CustomViewAssertions.isRecyclerView());
        recycleView.check(matches(CustomViewMatcher.recyclerViewMatcher(10)));
    }
}
