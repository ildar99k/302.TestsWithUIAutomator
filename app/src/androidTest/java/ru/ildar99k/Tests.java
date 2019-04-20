package ru.ildar99k;

import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.ildar99k.pages.*;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class Tests extends BaseRunner {
    MainPage mainPage;
    TrendingPage trendingPage;
    SettingsPage settingsPage;
    ThemePage themePage;
    FeedbackPage feedbackPage;
    AboutPage aboutPage;
    @Test
    public void testTrending() {
        mainPage=myApp.getMainPage();
        mainPage.clickLeftMenuElementByName("Trending");
        trendingPage=myApp.getTrendingPage();
        assertEquals(true, trendingPage.checkExist());
    }
    @Test
    public void changeThemeCheck(){
        mainPage=myApp.getMainPage();
        mainPage.clickLeftMenuElementByName("Settings");
        settingsPage=myApp.getSettingsPage();
        settingsPage.clickOnTheme();
        themePage=myApp.getThemePage();
        themePage.chooseDarkTheme();
    }
    @Test
    public void checkToast(){
        mainPage=myApp.getMainPage();
        mainPage.clickLeftMenuElementByName("Send feedback");
        feedbackPage=myApp.getFeedbackPage();
        feedbackPage.clickOkOnWindow();
        feedbackPage.insertIntoTitle("hello");
        feedbackPage.clickOnDescription();
        assertEquals(true,feedbackPage.checkModelInfo());
        feedbackPage.clickOnSubmit();
        feedbackPage.wait1(1000);
        feedbackPage.clickOnSubmit();
        feedbackPage.wait1(2000);
        feedbackPage.makeScreenshot("//screen");
    }
    @Test
    public void ChangelogCheck(){
        mainPage=myApp.getMainPage();
        mainPage.clickLeftMenuElementByName("About");
        aboutPage=myApp.getAboutPage();
        aboutPage.checkChangelogText();
    }
    @Test
    public void RestorePurchasesCheck(){
        mainPage=myApp.getMainPage();
        mainPage.clickLeftMenuElementByName("Restore Purchases");
    }
}
