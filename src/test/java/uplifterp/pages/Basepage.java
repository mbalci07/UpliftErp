package uplifterp.pages;

import org.openqa.selenium.support.PageFactory;
import uplifterp.utilities.Driver;

public class Basepage {
    public Basepage(){
        PageFactory.initElements(Driver.get(),this);
    }




}
