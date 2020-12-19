package pages;

import support.DriverQA;

public class ListaProcessos extends BasePage {

    public ListaProcessos(DriverQA driver) {
        super(driver);
    }

    public void clickNovoProcess() {
        driver.click("btn-novo");
    }

    public void clickMostrarProcesso(String id) {
        driver.click("btn-show_" + id);
    }

    public void clickEditarProcesso(String id) {
        driver.click("btn-edit_" + id);
    }

    public void clickApagarProcesso(String id) {
        driver.click("btn-delete_" + id);
    }

    public void clickOkParaApagarProcesso() {
        driver.ChooseOkOnNextConfirmation();
    }

    public boolean procurarElementoProcesso(String id) {
        return driver.isDisplayed(id);
    }
}
