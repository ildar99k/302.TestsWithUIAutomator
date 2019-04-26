package ru.ildar99k.uiautomator.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class ThemePage extends Page {
    public ThemePage(UiDevice device, String packageName) {
        super(device, packageName);
    }

    public void chooseDarkTheme() {
        wait1(2000);
        swipeToRight();
        getUiObj(By.res("com.fastaccess.github.debug:id/apply")).get(1).click(1);
        wait1(3000);
    }

    public boolean checkchangedTheme() {
        return getUiObj(By.res("com.fastaccess.github.debug:id/coordinatorLayout")).size() == 3;
    }

    public void returnOldTheme() {
        wait1(2000);
        swipeToLeft();
        getUiObj(By.res("com.fastaccess.github.debug:id/apply")).get(0).click(1);
        wait1(3000);
    }
}
