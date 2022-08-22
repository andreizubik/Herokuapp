import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TyposTest extends BaseTest {

    @Test
    public void typos() {
        driver.get("http://the-internet.herokuapp.com/typos");
            driver.navigate().refresh();
            String textWithOrWithoutError = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]")).getText();
            assertEquals(textWithOrWithoutError, "Sometimes you'll see a typo, other times you won't");
        }
    }
