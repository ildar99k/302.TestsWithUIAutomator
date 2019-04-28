package ru.ildar99k.espresso.test;

import ru.ildar99k.espresso.pages.*;

public class Application {
    private final MainPage mainPage = new MainPage();
    private final TrendingPage trendingPage = new TrendingPage();
    private final FeedbackPage feedbackPage = new FeedbackPage();
    private final SettingsPage settingsPage = new SettingsPage();
    private final ThemePage themePage = new ThemePage();
    private final AboutPage aboutPage = new AboutPage();

    public Application() {
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public TrendingPage getTrendingPage() {
        return trendingPage;
    }

    public FeedbackPage getFeedbackPage() {
        return feedbackPage;
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
}
