package org.example.utils;

import org.example.driver.DriverSingleton;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Waiter {

    private final static int WAIT_TIMEOUT_SECONDS = 5;
    private final static int TIMEOUT_SECONDS = 500;

    private Waiter() {
    }

}

