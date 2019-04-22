package ru.ildar99k.pages;

import android.os.Build;
import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class FeedbackPage extends Page {

    public FeedbackPage(UiDevice device, String packageName) {
        super(device, packageName);
    }

    public void clickOkOnWindow() {
        getUiObj(By.clazz("android.widget.Button")).get(0).click();
    }

    public void insertIntoTitle(String text) {
        getUiObj(By.clazz("android.widget.EditText")).get(0).setText(text);
    }

    public void clickOnDescription() {
        clickElement(By.res("com.fastaccess.github.debug:id/description"));
    }

    public boolean checkModelInfo() {
        String info = getUiObj(By.res("com.fastaccess.github.debug:id/editText")).get(0).getText();
        return info.contains("**Manufacturer&Brand:** " + Build.MANUFACTURER);
    }

    public void clickOnSubmit() {
        clickElement(By.res("com.fastaccess.github.debug:id/submit"));
    }

}
