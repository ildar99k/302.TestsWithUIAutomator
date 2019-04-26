package ru.ildar99k.uiautomator.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class MainPage extends Page {
    public MainPage(UiDevice device, String packageName) {
        super(device, packageName);
    }

    public void openLeftMenu() {
        getUiObj(By.desc("Перейти вверх")).get(0).click();
    }

    public void clickLeftMenuElementByName(String name) {
        openLeftMenu();
        scrollToElement(name);
        getUiObjByText(name).click();
    }
}
