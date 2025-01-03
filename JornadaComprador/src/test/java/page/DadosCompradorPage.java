package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumActions;

public class DadosCompradorPage extends SeleniumActions {

	WebDriver driver;
	
	public DadosCompradorPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public WebElement titulo() {
		return visibilidadeDoElemento(driver, By.xpath("//div[@class='ds-u-label-big-normal spacer-8']"), 10);
	}
	
	public void inputNomeComprador(String nome) {
		click(By.xpath("//app-input[@label='Nome Completo']"), 10);
		slowType(By.xpath("//label[@for='nome']"), nome, 30);
	}
	
	public String txtErroNome() {
		return getText(By.xpath("//app-input[@label='Nome Completo']//span"), 10);
	}
	
	public void inputCpfComprador(String cpf) {
		click(By.xpath("//app-input[@label='CPF']"), 10);
		slowType(By.xpath("//app-input[@label='CPF']"), cpf, 30);
	}
	
	public String txtErroCpf() {
		return getText(By.xpath("//app-input[@label='CPF']//span"), 10);
	}
	
	public void inputCelularComprador(String celular) {
		click(By.xpath("//app-input[@label='Celular']"), 10);
		slowType( By.xpath("//app-input[@label='Celular']"), celular, 30);
	}
	
	public String txtErroCelular() {
		return getText(By.xpath("//app-input[@label='Celular']//span"), 10);
	}
	
	public void inputEmailComprador(String email) {
		click(By.xpath("//app-input[@label='E-mail']"), 10);
		slowType(By.xpath("//app-input[@label='E-mail']"), email, 30);
	}
	
	public String txtErroEmail() {
		return getText(By.xpath("//app-input[@label='E-mail']//span"), 10);
	}
	
	public boolean btnContinuar() {
		return isButtonEnabled(By.id("continuarDadosPessoais"), 30);
	}

	public void clicarContinuar() {
		click(By.id("continuarDadosPessoais"), 0);
	}

}
