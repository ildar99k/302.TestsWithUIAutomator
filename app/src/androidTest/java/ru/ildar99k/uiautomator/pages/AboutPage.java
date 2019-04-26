package ru.ildar99k.uiautomator.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class AboutPage extends Page {
    public AboutPage(UiDevice device, String packageName) {
        super(device, packageName);
    }

    public boolean checkChangelogText() {
        return getUiObj(By.textContains("Changelog")).get(0).getText().equals("Changelog");
    }
}
