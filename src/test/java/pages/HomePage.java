package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    @FindBy(name = "firstName")
    private WebElement firstname;

    @FindBy(name = "firstName")
    private WebElement lastName;

    public void setFirstname(String name){
        firstname.sendKeys(name);
    }

    public void setLastNametname(String name){
        firstname.sendKeys(name);
    }

}
