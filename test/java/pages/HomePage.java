package pages;

public class HomePage {

    @FindBy(Name = "firstName")
    private WebElement firstname;

    @FindBy(Name = "firstName")
    private WebElement lastName;

    public void setFirstname(String name){
        firstname.setValue(name);
    }

    public void setLastNametname(String name){
        firstname.setValue(name);
    }

}
