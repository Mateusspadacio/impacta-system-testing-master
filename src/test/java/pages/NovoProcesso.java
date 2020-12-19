package pages;

import support.DriverQA;

public class NovoProcesso extends BasePage {

    private static String code;

    public NovoProcesso(DriverQA driver) {
        super(driver);
    }

    public void preencherCampo(String campo, String valor) {
        switch (campo) {
            case "vara":
                preencherInput("processo_vara", valor);
                break;
            case "número processo":
                preencherInput("processo_numero_processo", valor);
                break;
            case "natureza":
                preencherInput("processo_natureza", valor);
                break;
            case "partes":
                preencherInput("processo_partes", valor);
                break;
            case "urgente":
                selecionarUrgente(valor);
                break;
            case "arbitramento":
                selecionarArbitramento(valor);
                break;
            case "assistente social":
                preencherInput("processo_assistente_social", valor);
                break;
            case "data entrada":
                preencherInput("processo_data_entrada", valor);
                break;
            case "data saida":
                preencherInput("processo_data_saida", valor);
                break;
            case "data agendamento":
                preencherInput("processo_data_agendamento", valor);
                break;
            case "status":
                preencherInput("processo_status", valor);
                break;
            case "observação":
                preencherInput("processo_observacao", valor);
                break;
        }
    }

    public void preencherInput(String campo, String valor) {
        driver.sendKeys(valor, campo);
    }

    public void selecionarUrgente(String valor) {
        driver.selectByText(valor, "processo_urgente");
    }

    public void selecionarArbitramento(String valor) {
        if (valor.toLowerCase().equals("sim")) {
            driver.click("processo_arbitramento_s");
        } else {
            driver.click("processo_arbitramento_n");
        }
    }

    public void clickSave() {
        driver.click("btn-save");
    }

    public static String getCode() {
        return code;
    }

    public static void setCode(String pcode) {
        code = pcode;
    }
}
