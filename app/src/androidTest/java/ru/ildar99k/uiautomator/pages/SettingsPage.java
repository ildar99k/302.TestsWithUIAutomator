package ru.ildar99k.uiautomator.pages;

import android.support.test.uiautomator.UiDevice;

public class SettingsPage extends Page {
    public SettingsPage(UiDevice device, String packageName) {
        super(device, packageName);
    }

    public void clickOnTheme() {
        getUiObjByText("Theme").click();
    }
}
