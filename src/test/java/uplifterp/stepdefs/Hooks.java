package uplifterp.stepdefs;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import uplifterp.utilities.DBUtils;
import uplifterp.utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before("@db")
    public void setUpDatabase(){
        System.out.println("Creating database connection...");
        DBUtils.createConnection();
    }

    @Before
    public void setUp(){
        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Driver.get().manage().window().fullscreen();
    }

    @After("@db")
    public void tearDownDatabase(){
        System.out.println("Closing database connection...");
        DBUtils.destroyConnection();
    }

    @After
    public void tearDown(Scenario scenario){
        //if the scenario fails take the screenshot
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }

        Driver.closeDriver();
    }




}
