package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CriarListaSteps {
	
	TelaInicialPage telainicial = new TelaInicialPage(driver);
	

	@Dado("^que o usuario digite email ou phone number \"([^\"]*)\"$")
	public void queOUsuarioDigiteEmailOuPhoneNumber(String email) throws Throwable {
		telainicial.informarEmail(email);
		
	}

	@Dado("clique em sign in")
	public void cliqueEmSignIn() {
	    telainicial.acionarBotaoSignIn();
	}

	@Dado("digite a senha do usuario {string}")
	public void digiteASenhaDoUsuario(String password) {
	    telainicial.informarPassword(password);
	}

	@Entao("o usuario finaliza o login")
	public void oUsuarioFinalizaOLogin() {
	    telainicial.acionarBotaoSignIn();
	}

	@Quando("o usuario acionar o botao new list")
	public void oUsuarioAcionarOBotaoNewList() {
	    telainicial.criarLista();
	}

	@Quando("informar no campo enter list title {string}")
	public void informarNoCampoEnterListTitle(String lista1) {
	    telainicial.nomearLista(lista1);
	}

	@Quando("acionar o campo create list")
	public void acionarOCampoCreateList() {
	    telainicial.confirmarLista();
	}
	
	@Quando("^voltar para a pagina de listas$")
	public void voltarParaAPaginaDeListas() throws Throwable {
		telainicial.acionarBotaoVoltar();
	}

	@Entao("^o aplicativo cadastra a lista \"([^\"]*)\"$")
	public void oAplicativoCadastraALista(String listavalida) throws Throwable {
		assertEquals(listavalida , driver.findElement(By.xpath("//android.widget.TextView[@text='"+listavalida+"']")).getText());
	}
	
	@Quando("^selecionar a lista criada$")
	public void selecionarAListaCriada() throws Throwable {
		telainicial.selecionarListaCriada();
	}

	@Quando("o usuario clicar no nome da lista criada")
	public void oUsuarioClicarNoNomeDaListaCriada() {  
		telainicial.clicarListaTitulo();
	}

	@Quando("informar o novo nome {string}")
	public void informarONovoNome(String listaEditada) { 
		telainicial.editarLista(listaEditada);
	}

	@Quando("clicar no botao save")
	public void clicarNoBotaoSave() { 
		telainicial.confirmarLista();
	}


	@Quando("o usuario acionar o botao mais")
	public void oUsuarioAcionarOBotaoMais() {    
		telainicial.acionarBotaoAdd();
	}

	@Quando("adicionar o item desejado {string}")
	public void adicionarOItemDesejado(String itemAdicionado) { 
		telainicial.adicionarItem(itemAdicionado);
	}
	
	@Quando("confirmar a criacao no botao enviar")
	public void confirmarACriacaoNoBotaoConfirmar() {   
		telainicial.confirmarNovoItem();
	}

	@Entao("o item sera adicionado {string}")
	public void oItemSeraAdicionado(String itemValido) {
		assertEquals(itemValido , driver.findElement(By.xpath("//android.widget.TextView[@text='"+itemValido+"']")).getText());
	}

	@Quando("o usuario clicar no item desejado")
	public void oUsuarioClicarNoItemDesejado() {
		telainicial.abrirOpcoesItem();
	
	}

	@Quando("selecionar a lixeira para deletar")
	public void selecionarALixeiraParaDeletar() {
		telainicial.deletarItem();
	
	}

	@Quando("clicar em delete task")
	public void clicarEmDeleteTask() {		
		telainicial.confirmarDeleteItem();
	}


	@Entao("o item da lista e excluido {string}")
	public void oItemDaListaEExcluido(String ItemTeste) {	    
		assertTrue(driver.findElements(By.xpath("//android.widget.TextView[@text='ItemTeste']")).size()<1);
	}

	@Quando("o usuario clicar nas opcoes de lista")
	public void oUsuarioClicarNasOpcoesDeLista() {	    	
		telainicial.abrirOpcoesLista();
	}

	@Quando("clicar em delete lista")
	public void clicarEmDeleteLista() {    
		telainicial.deletarLista();
	}
	
	@E("^confirmar o delete da lista$")
	public void confirmarODeleteDaLista() throws Throwable {
		telainicial.confirmarDeletarLista();
	}

	@Entao("o sistema valida a exclusao da lista")
	public void oSistemaValidaAExclusaoDaLista() {
	    assertEquals(true, driver.findElements(By.xpath("//android.widget.TextView[@text='Lista1']")).size()<1);
	}

}
