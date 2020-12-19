package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class ProcessoSteps extends BaseSteps {

    private HomePage homePage = new HomePage(driver);
    private Menu menu = new Menu(driver);
    private ListaProcessos listaProcessos = new ListaProcessos(driver);
    private NovoProcesso novoProcesso = new NovoProcesso(driver);
    private DetalheProcesso detalheProcesso = new DetalheProcesso(driver);

    @Dado("^que o usuário esta na página inicial$")
    public void queOUsuarioEstaNaPaginaInicial() {
        homePage.open();
    }

    @Quando("^o usuário clicar no menu Processos")
    public void oUsuarioClicarNoMenuProcessos() {
        menu.clickProcessos();
    }

    @E("^o usuário clica no botão Novo Processo$")
    public void oUsuarioClicaNoBotaoNovoProcesso() {
        listaProcessos.clickNovoProcess();
    }

    @E("^o usuário preenche o campo \"([^\"]*)\" com o valor \"([^\"]*)\"$")
    public void oUsuarioPreencheOcampoComOValor(String campo, String valor) {
        novoProcesso.preencherCampo(campo, valor);
    }

    @Quando("^o usuário clicar no botão Salvar$")
    public void oUsuarioClicarNoBotaoSalvar() {
        novoProcesso.clickSave();
        novoProcesso.setCode(detalheProcesso.getValorCampo("codigo"));
    }


    @Então("^o usuário devera ver a mensagem \"([^\"]*)\"$")
    public void oUsuarioDeveraVerAMensagem(String mensagem) {
        Assert.assertEquals(mensagem, detalheProcesso.getNotice());
    }

    @E("^o usuário devera ver o campo \"([^\"]*)\" igual a \"([^\"]*)\"$")
    public void oUsuarioDeveraVerOCampoIgualA(String campo, String valor) {
        Assert.assertEquals(valor, detalheProcesso.getValorCampo(campo));
    }

    @E("^o usuário clica no botão voltar$")
    public void oUsuárioClicaNoBotãoVoltar() {
        detalheProcesso.clickVoltar();
    }

    @Dado("^que o usuário esta na página de detalhes do processo$")
    public void queOUsuárioEstaNaPáginaDeDetalhesDoProcesso() {
    }

    @Quando("^o usuário clicar no botão mostrar$")
    public void oUsuárioClicarNoBotãoMostrar() throws InterruptedException {
        listaProcessos.clickMostrarProcesso(novoProcesso.getCode());
        Thread.sleep(2000);
    }

    @Quando("^o usuário clicar no botão editar$")
    public void oUsuarioClicarNoBotaoEditar() {
        listaProcessos.clickEditarProcesso(novoProcesso.getCode());
    }

    @Quando("^o usuário clicar no botão apagar$")
    public void oUsuarioClicarNoBotaoApagar() {
        listaProcessos.clickApagarProcesso(novoProcesso.getCode());
    }

    @E("^o usuário confirmar a ação de apagar$")
    public void oUsuarioConfirmarAcaoDeApagar() {
        listaProcessos.clickOkParaApagarProcesso();
    }

    @Então("^o usuário não deve visualizar o processo na lista$")
    public void oUsuarioNaoDeveVisualizarOProcessoNaLista() throws InterruptedException {
        Assert.assertFalse(listaProcessos.procurarElementoProcesso(novoProcesso.getCode()));
    }

    @Quando("^o usuário clicar no botão mostrar do processo \"([^\"]*)\"$")
    public void oUsuarioClicarNoBotaoMostrarDoProcesso(String id) throws InterruptedException {
        listaProcessos.clickMostrarProcesso(id);
        Thread.sleep(2000);
    }
}
