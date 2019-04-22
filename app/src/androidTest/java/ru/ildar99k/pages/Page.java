package ru.ildar99k.pages;

import android.support.test.uiautomator.*;

import java.util.List;

public class Page {
    private final UiDevice device;
    private final String packageName;

    public Page(UiDevice device, String packageName) {
        this.device = device;
        this.packageName = packageName;
    }


    protected List<UiObject2> getUiObj(BySelector selector) {
        device.wait(Until.findObject(selector), 10000);
        return device.findObjects(selector);
    }

    protected UiObject2 getUiObjByText(String text) {
        return getUiObj(By.text(text)).get(0);
    }


    protected void clickElement(BySelector selector) {
        getUiObj(selector).get(0).click();
    }

    public void scrollToElement(String name) {
        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
        try {
            appViews.scrollIntoView(new UiSelector().text(name));
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }

    protected void swipeToRight() {
        device.drag(device.getDisplayWidth() - 10, device.getDisplayHeight() / 2, 10, device.getDisplayHeight() / 2, 10);
        wait1(1000);
    }

    protected void swipeToLeft() {
        device.drag(10, device.getDisplayHeight() / 2, device.getDisplayWidth() - 10, device.getDisplayHeight() / 2, 10);
        wait1(1000);
    }

    public void wait1(int time) {
        device.waitForWindowUpdate(packageName, time);
    }
}
