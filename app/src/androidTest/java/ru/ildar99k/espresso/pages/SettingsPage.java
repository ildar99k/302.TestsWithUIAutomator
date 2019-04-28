package ru.ildar99k.espresso.pages;

import android.graphics.Color;
import com.fastaccess.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.matcher.ViewMatchers.hasTextColor;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.AllOf.allOf;

public class SettingsPage extends Page {
    public void clickToTheme() {
        clickToElByName("Theme");
    }

    public void checkColor() {
        onView(allOf(withParent(withId(R.id.toolbar)), withText(containsString("Settings")), hasTextColor(Color.WHITE)));
    }
}
