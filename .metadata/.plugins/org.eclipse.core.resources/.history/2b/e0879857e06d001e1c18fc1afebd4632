package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import task.ValidarDadosDoCompradorTask;
import utils.BrowserDriverMananger;

public class TelaDadosVendaTest {

	private WebDriver driver;
	ValidarDadosDoCompradorTask dadosCompradorTask;
	BrowserDriverMananger browserMananger;
	
	@Before
	public void setUp() {
	    browserMananger = new BrowserDriverMananger();
		driver = BrowserDriverMananger.browser("edge");
		driver.get("Coloque o Link de pagamento");	
		dadosCompradorTask = new ValidarDadosDoCompradorTask(driver);
	}
	@After
	public void fecharTeste() {
		driver.quit();
	}
	@Test
	public void telaDadoVendaParcelada() {		
		dadosCompradorTask.validaDadoVenda();
	}
	
	@Test
	public void telaDadosComprador() {
		dadosCompradorTask.validaDadosComprador("Fulano de tal","00000000191", "51999999999", "teste@teste.com");
	}
	@Test
	public void validaMsgErroApenasUmNome() {
		dadosCompradorTask.validaMensagemErroApenasUmNome("Fulano");
	}
	
	@Test
	public void validaMsgErroNomeVazio() {
		dadosCompradorTask.validaMensagemErroCampoNomeVazio("");
	}
	
	@Test
	public void validaMsgErroCpfVazio() {
		dadosCompradorTask.validaMensagemErroSemCpf("");
	}
	@Test
	public void validaMsgErroCpfInvalido() {
		dadosCompradorTask.validaMensagemErroCpfInvalido("000");
	}
	
	@Test
	public void validaMsgErroCelularVazio() {
		dadosCompradorTask.validaMensagemErroSemCelular("");
	}
	
	@Test
	public void validaMsgErroCelularInvalido() {
		dadosCompradorTask.validaMensagemErroCelularInvalido("51999");
	}
	
	@Test
	public void validaMsgErroEmailVazio() {
		dadosCompradorTask.validaMensagemErroSemEmail("");
	}
	
	@Test
	public void validaMsgErroEmailInvalido() {
		dadosCompradorTask.validaMensagemErroSemEmail("test.23");
	}
}
