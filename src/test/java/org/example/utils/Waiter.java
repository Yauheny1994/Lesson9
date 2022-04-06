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

    public static void waitForToBeClickable(WebElement element){
        new FluentWait<>(DriverSingleton.getDriver()).withTimeout(Duration.ofSeconds(WAIT_TIMEOUT_SECONDS))
                .pollingEvery(Duration.ofMillis(TIMEOUT_SECONDS)).ignoring(NoSuchElementException.class)
                .until((ExpectedCondition<Boolean>) webDriver -> element.isDisplayed() && element
                .isEnabled());
    }



}
