package pageObjects;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static utils.Utils.*;

public class TelaInicialPage {
	
	public TelaInicialPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.microsoft.todos:id/email_phone_edit_text")
	private MobileElement campoEmail;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='Sign in']")
	private MobileElement botaoSignIn;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.EditText")
    private MobileElement campoPassword;
	
//	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[9]/android.widget.Button")
//	private MobileElement botaoConfPassword;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_list_text_view")
	private MobileElement novaLista;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/edit_text")
	private MobileElement nomeLista;
	
	@AndroidFindBy(id = "android:id/button1")
	private MobileElement confirmaLista;
	
	@AndroidFindBy(id = "cde407d79-bd1d-4a45-af91-4f601b33eaba")
	private MobileElement validaLista;
	
	@AndroidFindBy(accessibility = "Back")
	private MobileElement botaoVoltar;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/name_background")
	private MobileElement listaTitulo;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/new_todo_fab")
	private MobileElement botaoAddItem;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_edit_text")
	private MobileElement novoItem;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/create_task_image_button")
	private MobileElement botaoConfirmarItem;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Lista1']")
	private MobileElement selecaoLista;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='ItemTeste']")
	private MobileElement opcoesItem;
	
	@AndroidFindBy(id = "com.microsoft.todos:id/delete")
	private MobileElement deleteItem;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='DELETE']")
	private MobileElement confirmaDelete;
	
	@AndroidFindBy(accessibility = "More options")
	private MobileElement opcoesLista;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Delete list']")
	private MobileElement deleteList;
	
	public void informarEmail(String email) {
		campoEmail.sendKeys(email);
	}

	public void acionarBotaoSignIn() {
		botaoSignIn.click();
	}
	
	public void informarPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
//	public void confirmarPassword() {
//		botaoSignIn.click();	
//	}
	
	public void criarLista() {
		novaLista.click();
	}
	
	public void nomearLista(String lista1) {
		nomeLista.sendKeys(lista1);
	}
	
	public void confirmarLista() {
		confirmaLista.click();
	}
	
	public void acionarBotaoVoltar() {
		botaoVoltar.click();
	}

	public void clicarListaTitulo() {
		listaTitulo.click();
	}
	
	public void editarLista(String listaEditada) {
		nomeLista.sendKeys(listaEditada);
	}
	
	public void confirmarListaEditada() {
		confirmaLista.click();
	}
	
	public void acionarBotaoAdd() {
		botaoAddItem.click();
	}
	
	public void adicionarItem(String itemAdicionado) {
		novoItem.sendKeys(itemAdicionado);
	}
	
	public void confirmarNovoItem() {
		botaoConfirmarItem.click();
	}
	
	public void selecionarListaCriada() {
		selecaoLista.click();
	}
	
	public void abrirOpcoesItem() {
		opcoesItem.click();
	}
	
	public void deletarItem() {
		deleteItem.click();
	}
	
	public void confirmarDeleteItem() {
		confirmaDelete.click();
	}
	
	public void abrirOpcoesLista() {
		opcoesLista.click();
	}
	
	public void deletarLista() {
		deleteList.click();
		
	}
	
	public void confirmarDeletarLista() {
		confirmaDelete.click();
	}
}
