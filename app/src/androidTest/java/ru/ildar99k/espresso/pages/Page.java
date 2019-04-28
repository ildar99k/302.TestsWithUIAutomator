package ru.ildar99k.espresso.pages;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Page {
    public void clickToElByName(String name) {
        onView(withText(name)).perform(click());
    }
}
