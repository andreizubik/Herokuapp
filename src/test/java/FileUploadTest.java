import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.File;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        driver.get("http://the-internet.herokuapp.com/upload");
        driver.findElement(By.id("drag-drop-upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/user/OneDrive - UAB AIS Consulting/Рисунки/Снимки экрана/zoub1wL7Zo0-3.jpg");
        driver.findElement(By.cssSelector("[value=Upload]")).click();
        String actualResult = driver.findElement(By.id("uploaded-files")).getText();
        String expectedResult = "zoub1wL7Zo0-3.jpg";
        assertEquals(actualResult, expectedResult, "File name should be " + expectedResult);

    }
}
