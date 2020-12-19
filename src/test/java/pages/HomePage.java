package pages;

import support.DriverQA;

public class HomePage extends BasePage {

    private static final String URL = "http://agapito-server.herokuapp.com/";

    public HomePage(DriverQA driver) {
        super(driver);
    }

    public void open() {
        driver.openURL(URL);
    }
}
