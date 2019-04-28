package ru.ildar99k.espresso.pages;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.AllOf.allOf;

public class TrendingPage {
    public void checkTitle(String name) {
        onView(allOf(withClassName(containsString("AppCompatTextView")), withParent(withId(R.id.toolbar)))).check(matches(withText(name)));
    }
}
