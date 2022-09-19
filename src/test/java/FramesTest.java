import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTest extends BaseTest {

    @Test
    public void frames() {

        driver.get("http://the-internet.herokuapp.com/frames");
        driver.findElement(By.cssSelector("[href='/iframe']")).click();
        driver.switchTo().frame("mce_0_ifr");
        String actualResult = driver.findElement(By.id("tinymce")).getText();
        String expectedResult = "Your content goes here.";
        assertEquals(actualResult, expectedResult, "Text should be " + expectedResult);
    }
}
