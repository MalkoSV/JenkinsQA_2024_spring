package school.redrover;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import school.redrover.runner.BaseTest;

public class FreestyleProject5Test extends BaseTest {

    @Test
    public void testCheckFreestyleProjectNameOnTheDashboard() {
        String projectName = "ProjectName";

        getDriver().findElement(By.xpath("//*[@href='/view/all/newJob']")).click();
        getDriver().findElement(By.xpath("//*[@class='hudson_model_FreeStyleProject']")).click();
        getDriver().findElement(By.id("name")).sendKeys(projectName);
        getDriver().findElement(By.id("ok-button")).click();
        getDriver().findElement(By.xpath("//*[@name='Submit']")).click();
        getDriver().findElement(By.id("jenkins-home-link")).click();

        Assert.assertEquals(getDriver().findElement(By.xpath(
                "//*[@href='job/" + projectName + "/']/span")).getText(), projectName);
    }
}
