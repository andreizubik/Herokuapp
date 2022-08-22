import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest {

    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).click();
        driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_UP");
        String upArrowButton = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(upArrowButton, "1");
        driver.findElement(By.tagName("input")).sendKeys("Keys.ARROW_DOWN", "Keys.ARROW_DOWN");
        String downArrowButton = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(downArrowButton, "-2");

        //ввод букв
        driver.navigate().refresh();
        driver.findElement(By.tagName("input")).sendKeys("abc");
        String letterInput = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(letterInput, "abc");

        //ввод цифр
        driver.navigate().refresh();
        driver.findElement(By.tagName("value")).sendKeys("123");
        String numberInput = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(numberInput, "123");

    }
}

