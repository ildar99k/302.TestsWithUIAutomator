package ru.ildar99k.espresso.pages;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.AllOf.allOf;

public class AboutPage extends Page {
    public void scrollToAbout() {
        onView(allOf(withClassName(containsString("AppCompatTextView")), withSubstring("About"))).perform(swipeUp());
    }

    public void checkChangelog() {
        onView(allOf(withId(R.id.mal_item_text), withText("Changelog")));
    }
}
