import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoversTest extends BaseTest {

    @Test
    public void hovers() {
        driver.get("http://the-internet.herokuapp.com/hovers");
        Actions action = new Actions(driver);
        WebElement user1 = driver.findElement(By.xpath("//div[@id='content']//descendant::div[@class='figure'][1]"));
        action.moveToElement(user1).build().perform();
        WebElement Name_user1 = driver.findElement(By.xpath("//h5[text()='name: user1']"));
        WebElement link1 = driver.findElement(By.xpath("//h5[text()='name: user1']/following-sibling::a"));
        Assert.assertTrue(Name_user1.isDisplayed());
        link1.click();
        WebElement viewProfilePage = driver.findElement(By.xpath("//h1[text()='Not Found']"));
        Assert.assertTrue(viewProfilePage.isDisplayed());
        driver.navigate().back();
    }
}
