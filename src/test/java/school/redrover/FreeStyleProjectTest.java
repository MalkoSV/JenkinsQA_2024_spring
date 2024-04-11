package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import school.redrover.runner.BaseTest;
import java.time.Duration;
import static org.testng.AssertJUnit.assertTrue;

public class FreeStyleProjectTest extends BaseTest {

    @Test

    public void testCreateFreestyleProject() {

        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

        WebElement text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Welcome to Jenkins!')]")));
        assertTrue(text.isDisplayed());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='tasks']/div[1]/span/a"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("jenkins-input"))).sendKeys("new Freestyle project");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type = 'submit']"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Freestyle project')]"))).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type= 'submit']"))).click();

        WebElement titleConfigure = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Configure')]")));
        assertTrue(titleConfigure.isDisplayed());

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Save')]"))).click();

        WebElement textPresent = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'new Freestyle project')]")));
        assertTrue(textPresent.isDisplayed());
    }
}
