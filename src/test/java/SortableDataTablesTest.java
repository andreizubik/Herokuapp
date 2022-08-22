import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SortableDataTablesTest extends BaseTest {

    @Test
    public void SortableDataTables() {
        driver.get("http://the-internet.herokuapp.com/tables");
        String lastName = driver.findElement(By.xpath("//table//tr[1]//td[1]")).getAttribute("innerText");
        assertEquals(lastName, "Smith");
        String firstName = driver.findElement(By.xpath("//table//tr[1]//td[2]")).getAttribute("innerText");
        assertEquals(firstName, "John");
        String email = driver.findElement(By.xpath("//table//tr[1]//td[3]")).getAttribute("innerText");
        assertEquals(email, "jsmith@gmail.com");
        String due = driver.findElement(By.xpath("//table//tr[1]//td[4]")).getAttribute("innerText");
        assertEquals(due, "$50.00");
        String webSite = driver.findElement(By.xpath("//table//tr[1]//td[5]")).getAttribute("innerText");
        assertEquals(webSite, "http://www.jsmith.com");

    }
}
