package uplifterp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uplifterp.utilities.Driver;

public class Login {
    //Find By annatotions to use them with locaters init elements in this page use constractor
    public Login(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(id="login")
    public WebElement username;

    @FindBy(css = "#password")
    public WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement submit;



    public void login(String userNameStr,String passwordStr){
        username.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();

    }

}
