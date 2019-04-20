package ru.ildar99k.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.Direction;
import android.support.test.uiautomator.UiDevice;

public class ThemePage extends Page {
    public ThemePage(UiDevice device, String packageName) {
        super(device, packageName);
    }
    public void chooseDarkTheme(){
        swipeToRight();
        getUiObj(By.clazz("android.view.ViewGroup")).get(0).swipe(Direction.RIGHT, 0.7f);
        getUiObj(By.clazz("android.view.ViewGroup")).get(0).swipe(Direction.LEFT, 0.7f);
        getUiObj(By.clazz("android.view.ViewGroup")).get(1).findObject(By.clazz("android.widget.ImageButton")).click();
    }
}
