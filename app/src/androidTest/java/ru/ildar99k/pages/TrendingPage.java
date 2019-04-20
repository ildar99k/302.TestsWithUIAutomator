package ru.ildar99k.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class TrendingPage extends Page {

    public TrendingPage(UiDevice device, String packageName) {
        super(device, packageName);
    }
    public boolean checkExist(){
        return getUiObj(By.res("com.fastaccess.github.debug:id/toolbar")).get(0)
                .findObject(By.textContains("Trending")).isEnabled();
    }
}
