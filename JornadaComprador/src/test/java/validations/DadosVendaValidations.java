package validations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import page.DadosCompradorPage;
import page.DadosVendaPage;
import utils.SeleniumActions;

public class DadosVendaValidations extends SeleniumActions {

	DadosVendaPage vendaPage;
	DadosCompradorPage compradorPage;
	SeleniumActions actions;

	public DadosVendaValidations(WebDriver driver) {
		super(driver);
		this.vendaPage = new DadosVendaPage(driver, this);
		this.compradorPage = new DadosCompradorPage(driver);
	}

	public void validaDadosVenda() {
		assertEquals("Nome esta diferente", vendaPage.txtNomeVendedor(), "TESTE");
		assertEquals("estao diferentes ",vendaPage.txtCpfVendedor().trim(), "000.000.001-91");
		assertEquals("estao diferentes ",vendaPage.txtValidade(), "Link válido até");
		assertTrue("estao diferentes ",vendaPage.txtValor().contains("444,44"));
	}
}
