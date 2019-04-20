package ru.ildar99k;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;
import ru.ildar99k.pages.*;

public class TestApplication {
    private UiDevice device;
    private MainPage mainPage;
    private SettingsPage settingsPage;
    private ThemePage themePage;
    private AboutPage aboutPage;
    private TrendingPage trendingPage;
    private FeedbackPage feedbackPage;
    public TestApplication() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
        final String launcherPackage = device.getLauncherPackageName();
        System.out.println(launcherPackage);
        // Get launch intent
        String packageName = InstrumentationRegistry.getTargetContext()
                .getPackageName();
        System.out.println(packageName);
        device.wait(Until.hasObject(By.pkg(packageName).depth(0)),
                10000);
        Context context = InstrumentationRegistry.getContext();
        Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(packageName);

        // Stat application
        context.startActivity(intent);
        device.wait(Until.hasObject(By.pkg(packageName).depth(0)),
                1000);
        // Get page objects
        mainPage = new MainPage(device, packageName);
        settingsPage=new SettingsPage(device,packageName);
        themePage=new ThemePage(device,packageName);
        aboutPage=new AboutPage(device,packageName);
        trendingPage=new TrendingPage(device, packageName);
        feedbackPage=new FeedbackPage(device,packageName);
    }
    public void close() {
        device.pressHome();
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public SettingsPage getSettingsPage() {
        return settingsPage;
    }

    public ThemePage getThemePage() {
        return themePage;
    }

    public AboutPage getAboutPage() {
        return aboutPage;
    }

    public TrendingPage getTrendingPage() {
        return trendingPage;
    }

    public FeedbackPage getFeedbackPage() {
        return feedbackPage;
    }
}
