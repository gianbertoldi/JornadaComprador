package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumActions;

public class DadosVendaPage extends SeleniumActions {
	
	SeleniumActions actions;
	WebDriver driver;
	
	public DadosVendaPage(WebDriver driver, SeleniumActions actions) {
		super(driver);
		this.driver = driver;
	}

	public String txtNomeVendedor() {
		By txtNome = By.xpath("//div[@class='spacer-8 ske-width-90 ske-margin-bottom-8']/span[@class='ds-u-label-medium-normal']");
		return getText(txtNome , 30);
	}
	public String txtCpfVendedor() {
		return getText(By.xpath("//div[@class='ske-width-70']/span[@class='ds-u-label-medium-normal']"), 30);
	}
	
	public String txtValidade() {
		By txtValidade = By.xpath("//div[@class='ske-width-35']/div[@class='ds-u-text-medium-normal spacer-4']");
		return getText(txtValidade, 30);
	}
	
	public String txtValor() {
		return getText(By.xpath("//div[@class='ske-width-20']/div[@class='ds-u-label-medium-normal']"), 30);
	}
	
	public String txtMaximoParcela() {
		return getText( By.xpath("//div[@class='ske-width-30']/div[@class='ds-u-label-medium-normal']"), 30);
	}
	
	public void btnContinuar() {
		click(By.xpath("//button[@class='botao ds-u-label-medium-action-light']"), 30);
	}
}
