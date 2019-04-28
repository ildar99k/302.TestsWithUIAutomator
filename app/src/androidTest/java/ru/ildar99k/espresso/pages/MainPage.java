package ru.ildar99k.espresso.pages;

import com.fastaccess.R;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.AllOf.allOf;

public class MainPage extends Page {
    public void openLeftMenu() {
        onView(allOf(withClassName(containsString("AppCompatImageButton")), withParent(withId(R.id.toolbar)))).perform(click());
    }

    public void clickOnMenuElementByName(String name) {
        try {
            onView(allOf(withChild(withText(containsString(name))), withClassName(containsString("NavigationMenuItemView")))).perform(click());
        } catch (Exception e) {
            onView(withId(R.id.extrasNav)).perform(swipeUp());
            onView(allOf(withChild(withText(containsString(name))), withClassName(containsString("NavigationMenuItemView")))).perform(click());
        }
    }

    public void checkIntent() {
        intended(hasComponent(hasClassName("CheckPurchaseActivity.class")));
    }

}
