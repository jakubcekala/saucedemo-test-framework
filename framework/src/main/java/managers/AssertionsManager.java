package managers;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

public abstract class AssertionsManager {
    protected void elementIsDisplayed (WebElement element) {
        Assert.assertTrue(element.isDisplayed(), element.toString() + " element is not displayed");
    }
}
