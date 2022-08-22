import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckboxesTest extends BaseTest {

    @Test
    public void checkBoxesTest() {
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
        assertFalse(checkBoxes.get(0).isSelected(), "Checkbox is unchecked");
        checkBoxes.get(0).click();
        assertTrue(checkBoxes.get(0).isSelected(), "Checkbox is checked");
        assertTrue(checkBoxes.get(1).isSelected(), "Checkbox is checked");
        checkBoxes.get(1).click();
        assertFalse(checkBoxes.get(1).isSelected(), "Checkbox is unchecked");
    }
}
