package ru.ildar99k;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;
import ru.ildar99k.pages.*;

import java.io.File;

public class TestApplication {
    private final UiDevice device;
    private final MainPage mainPage;
    private final SettingsPage settingsPage;
    private final ThemePage themePage;
    private final AboutPage aboutPage;
    private final TrendingPage trendingPage;
    private final FeedbackPage feedbackPage;

    public TestApplication() {
        device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        device.pressHome();
        final String launcherPackage = device.getLauncherPackageName();
        System.out.println(launcherPackage);
        String packageName = InstrumentationRegistry.getTargetContext()
                .getPackageName();
        device.wait(Until.hasObject(By.pkg(packageName).depth(0)),
                1000);
        Context context = InstrumentationRegistry.getContext();
        Intent intent = context.getPackageManager()
                .getLaunchIntentForPackage(packageName);
        context.startActivity(intent);
        device.wait(Until.hasObject(By.pkg(packageName).depth(0)),
                10000);
        mainPage = new MainPage(device, packageName);
        settingsPage = new SettingsPage(device, packageName);
        themePage = new ThemePage(device, packageName);
        aboutPage = new AboutPage(device, packageName);
        trendingPage = new TrendingPage(device, packageName);
        feedbackPage = new FeedbackPage(device, packageName);
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

    public void makeScreen() {
        device.takeScreenshot(new File(InstrumentationRegistry.getContext().getFilesDir(), "Toast Screen " + System.currentTimeMillis()));
    }
}
