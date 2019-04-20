package ru.ildar99k.pages;

import android.support.test.uiautomator.*;

import java.io.File;
import java.util.List;

public class Page {
    private UiDevice device;
    private final String packageName;

    public Page(UiDevice device, String packageName) {
        this.device = device;
        this.packageName = packageName;
    }
    protected void goBack(){
        device.pressBack();
    }
    protected List<UiObject2> getUiObj(BySelector selector) {
        device.wait(Until.findObject(selector), 100000);
        return device.findObjects(selector);
    }
    protected UiObject2 getUiObjByText(String text) {
        return getUiObj(By.text(text)).get(0);
    }
    protected void clickElementByText(String name){
        getUiObjByText(name).click();
    }
    protected void clickElement(BySelector selector){
        getUiObj(selector).get(0).click();
    }
    protected void scrollToElement(String name) {
        UiScrollable appViews = new UiScrollable(new UiSelector().scrollable(true));
        try {
            appViews.scrollIntoView(new UiSelector().text(name));
        } catch (UiObjectNotFoundException e) {
            e.printStackTrace();
        }
    }
    protected void swipeToRight(){
        device.drag(device.getDisplayWidth()-10,device.getDisplayHeight()/2,10,device.getDisplayHeight()/2,100);
    }
    public void wait1(int time){
        device.waitForWindowUpdate(packageName,time);
    }
    public void makeScreenshot(String path){
        device.takeScreenshot(new File(path));
    }

}
