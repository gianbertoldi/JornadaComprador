package validations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.openqa.selenium.WebDriver;

import utils.SeleniumActions;

public class GenericValidations extends SeleniumActions{

	SeleniumActions actions;
	
	public GenericValidations(WebDriver driver) {
		super(driver);
	}
	
	public boolean estaDesabilitado(boolean desabilitado) {
		assertFalse("botao esta habilitado", desabilitado);
		return true;
	}

	public void validaTextoEsperadoAtual(String textoAtual, String textoEsperado) {
		assertEquals(textoAtual, textoEsperado);
	}
	
	
}
