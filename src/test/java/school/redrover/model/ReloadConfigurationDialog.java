package school.redrover.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import school.redrover.model.base.BasePage;

public class ReloadConfigurationDialog extends BasePage {

    @FindBy(className = "jenkins-dialog__title")
    private WebElement reloadConfigurationFromDiskDialogTitle;

    public ReloadConfigurationDialog(WebDriver driver) {
        super(driver);
    }

    public boolean dialogTitleVisibility() {
        return getWait2().until(ExpectedConditions.visibilityOf(reloadConfigurationFromDiskDialogTitle)).isDisplayed();
    }
}
