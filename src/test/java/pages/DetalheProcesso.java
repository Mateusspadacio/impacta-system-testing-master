package pages;

import support.DriverQA;

public class DetalheProcesso extends BasePage {

    public DetalheProcesso(DriverQA driver) {
        super(driver);
    }

    public String getNotice() {
        return driver.getText("notice");
    }

    public String getValorCampo(String campo) {
        String valor = "";
        switch(campo) {
            case "codigo":
                valor = driver.getText("codigo");
                break;
            case "vara":
                valor = driver.getText("vara");
                break;
            case "número processo":
                valor = driver.getText("numero");
                break;
            case "natureza":
                valor = driver.getText("natureza");
                break;
            case "partes":
                valor = driver.getText("partes");
                break;
            case "urgente":
                valor = driver.getText("urgente");
                break;
            case "arbitramento":
                valor = driver.getText("arbitramento");
                break;
            case "assistente social":
                valor = driver.getText("as_social");
                break;
            case "data entrada":
                valor = driver.getText("dt_entrada");
                break;
            case "data saida":
                valor = driver.getText("dt_saida");
                break;
            case "data agendamento":
                valor = driver.getText("dt_agendamento");
                break;
            case "status":
                valor = driver.getText("status");
                break;
            case "observacao":
                valor = driver.getText("observacao");

        }

        return valor;
    }

    public void clickVoltar() {
        driver.click(".ls-btn-primary-danger", "css");
    }
}
