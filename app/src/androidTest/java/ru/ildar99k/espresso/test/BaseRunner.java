package ru.ildar99k.espresso.test;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import com.fastaccess.ui.modules.main.MainActivity;
import org.junit.Rule;

public class BaseRunner {
    Application application = new Application();
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);
    public IntentsTestRule<MainActivity> intentsTestRule =
            new IntentsTestRule<>(MainActivity.class);


    public ActivityTestRule<MainActivity> getmActivityRule() {
        return mActivityRule;
    }
}
