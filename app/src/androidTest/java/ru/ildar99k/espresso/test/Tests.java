package ru.ildar99k.espresso.test;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.ildar99k.espresso.pages.*;

@RunWith(AndroidJUnit4.class)
public class Tests extends BaseRunner {
    MainPage mainPage;
    TrendingPage trendingPage;
    FeedbackPage feedbackPage;
    SettingsPage settingsPage;
    ThemePage themePage;
    AboutPage aboutPage;

    @Test
    public void checkTrending() {
        mainPage = application.getMainPage();
        mainPage.openLeftMenu();
        mainPage.clickOnMenuElementByName("Trending");
        trendingPage = application.getTrendingPage();
        trendingPage.checkTitle("Trending");
    }

    @Test
    public void checkChangedTheme() {
        mainPage = application.getMainPage();
        mainPage.openLeftMenu();
        mainPage.clickOnMenuElementByName("Settings");
        settingsPage = application.getSettingsPage();
        settingsPage.clickToTheme();
        themePage = application.getThemePage();
        themePage.changeThemeToDark();
        mainPage.openLeftMenu();
        mainPage.clickOnMenuElementByName("Settings");
        settingsPage = application.getSettingsPage();
        settingsPage.checkColor();
        settingsPage.clickToTheme();
        themePage.returnThemeToWhite();
    }

    @Test
    public void checkRestorePurchases() {
        mainPage = application.getMainPage();
        mainPage.openLeftMenu();
        mainPage.clickOnMenuElementByName("Restore Purchases");
        mainPage.checkIntent();
    }

    @Test
    public void checkToast() {
        mainPage = application.getMainPage();
        mainPage.openLeftMenu();
        mainPage.clickOnMenuElementByName("Send feedback");
        feedbackPage = application.getFeedbackPage();
        feedbackPage.clickToOk();
        feedbackPage.fillInTitle("hello");
        feedbackPage.checkPhoneInfo();
        feedbackPage.clickToSubmit();
        feedbackPage.checkToast(getmActivityRule());
    }

    @Test
    public void checkChangelog() {
        mainPage = application.getMainPage();
        mainPage.openLeftMenu();
        mainPage.clickOnMenuElementByName("About");
        aboutPage = application.getAboutPage();
        aboutPage.scrollToAbout();
        aboutPage.checkChangelog();
    }
}
