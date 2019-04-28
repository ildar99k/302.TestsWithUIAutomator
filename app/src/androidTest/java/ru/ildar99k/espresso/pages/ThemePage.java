package ru.ildar99k.espresso.pages;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.core.AllOf.allOf;

public class ThemePage extends Page {
    public void changeThemeToDark() {
        onView(withId(R.id.pager)).perform(swipeLeft());
        onView(allOf(withId(R.id.apply), isCompletelyDisplayed())).perform(click());
    }

    public void returnThemeToWhite() {
        onView(withId(R.id.pager)).perform(swipeRight());
        onView(allOf(withId(R.id.apply), isCompletelyDisplayed())).perform(click());
    }

}
