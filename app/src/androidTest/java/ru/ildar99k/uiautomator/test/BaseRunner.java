package ru.ildar99k.uiautomator.test;

import org.junit.After;
import org.junit.Before;

public class BaseRunner {
    TestApplication myApp;

    @Before
    public void setUp() {
        myApp = new TestApplication();
    }

    @After
    public void tearDown() {
        myApp.close();
    }
}
