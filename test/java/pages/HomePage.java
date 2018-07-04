package pages;

public class HomePage {

    @FindBy(Name = "firstName")
    private WebElement firstname;

    public void setFirstname(String name){
        firstname.setValue(name);
    }

}
