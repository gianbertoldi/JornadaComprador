package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumActions;

public class DadosDePgtoPage extends SeleniumActions {

	WebDriver driver;
	
	public DadosDePgtoPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	public void inputNumeroDoCrtao(String numCartao) {
		click(By.id("billing-cc-number"), 10);
		slowType(By.id("billing-cc-number"), numCartao, 30);
	}
	
	public String txtErroNumeroCartao() {
		return 
	}
	
	public void inputNomeNoCartao(String nome) {
		click(By.id("billing-cc-name"), 10);
		slowType(By.id("billing-cc-name"), nome, 30);
	}

	
}
