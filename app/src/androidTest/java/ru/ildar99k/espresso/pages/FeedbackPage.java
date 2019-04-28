package ru.ildar99k.espresso.pages;

import android.os.Build;
import android.support.test.rule.ActivityTestRule;
import com.fastaccess.R;
import com.fastaccess.ui.modules.main.MainActivity;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.AllOf.allOf;

public class FeedbackPage extends Page {
    public void clickToOk() {
        onView(allOf(withClassName(containsString("AppCompatButton")), withSubstring("OK"))).perform(click());
    }

    public void fillInTitle(String string) {
        onView(withClassName(containsString("TextInputEditText"))).perform(typeText(string));

    }

    public void checkPhoneInfo() {
        onView(withId(R.id.description)).perform(click());
        onView(withId(R.id.editText)).check(matches(withSubstring("Manufacturer&Brand:** " + Build.MANUFACTURER)));
        onView(withId(R.id.submit)).perform(click());
    }

    public void clickToSubmit() {
        onView(withId(R.id.submit)).perform(click());
    }

    public void checkToast(ActivityTestRule<MainActivity> act) {
        onView(withText("Message was sent")).
                inRoot(withDecorView(not(is(act.getActivity().getWindow().getDecorView())))).
                check(matches(isDisplayed()));
    }
}
