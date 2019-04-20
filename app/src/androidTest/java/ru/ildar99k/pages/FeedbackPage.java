package ru.ildar99k.pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;

public class FeedbackPage extends Page {

    public FeedbackPage(UiDevice device, String packageName) {
        super(device, packageName);
    }
    public void clickOkOnWindow(){
        getUiObj(By.clazz("android.widget.Button")).get(0).click();
    }
    public void insertIntoTitle(String text){
        getUiObj(By.clazz("android.widget.EditText")).get(0).setText(text);
    }
    public void clickOnDescription(){
        clickElement(By.res("com.fastaccess.github.debug:id/description"));
    }
    public boolean checkModelInfo(){
        String info=getUiObj(By.res("com.fastaccess.github.debug:id/editText")).get(0).getText();
        if (info.contains("**Model:** Android Emulator")&&info.contains("**Manufacturer&Brand:** Google")&&
        info.contains("**Android Version: 9 (SDK: 28)**")){
        return true;
        }
        return false;
    }
    public void clickOnSubmit(){
        clickElement(By.res("com.fastaccess.github.debug:id/submit"));
    }

}
