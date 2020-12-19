package pages;

import support.DriverQA;

public class Menu extends BasePage {

    public Menu(DriverQA driver) {
        super(driver);
    }

    public void clickProcessos() {
        driver.click("processos");
    }
}
