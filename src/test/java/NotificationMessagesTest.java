import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class NotificationMessagesTest extends BaseTest {

    @Test
    public void notificationMessages() {
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a [text() = 'Click here']")).click();
        boolean message = driver.findElement(By.xpath("//div[@class='flash notice']")).isDisplayed();
        assertTrue(message, "Action unsuccesful, please try again");
    }
}