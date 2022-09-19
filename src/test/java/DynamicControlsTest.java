import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DynamicControlsTest extends BaseTest {
    @Test public void dynamicControls() {
        driver.get("http://the-internet.herokuapp.com/dynamic_controls"); //открыли страничку
        WebElement checkBox = driver.findElement(By.cssSelector("[type=checkbox]"));
        driver.findElement(By.xpath("//button[contains(text(),'Remove')]")).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));
        boolean inputCondition;
        try {
            driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            checkBox.click();
        }
        catch (Exception exception){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }
        inputCondition = driver.findElement(By.cssSelector("[type=text]")).isEnabled();
        Assert.assertFalse(inputCondition);
        driver.findElement(By.xpath("//button[contains(text(),'Enable')]")).click();
        new WebDriverWait(driver,3).until(ExpectedConditions.visibilityOf(driver.findElement(By.id("message"))));
        inputCondition = driver.findElement(By.cssSelector("[type=text]")).isEnabled();
        Assert.assertTrue(inputCondition);
    }
}
