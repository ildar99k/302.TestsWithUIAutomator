package ru.ildar99k.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class AboutPage extends Page {
    public AboutPage(UiDevice device, String packageName) {
        super(device, packageName);
    }
    public  boolean checkChangelogText(){
       return getUiObj(By.clazz("android.widget.FrameLayout")).get(0).findObjects(By.clazz("android.widget.LinearLayout")).get(1).findObject(By.res("com.fastaccess.github.debug:id/mal_item_text"))
                .getText().equals("Changelog");
    }
}
