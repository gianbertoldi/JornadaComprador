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
		driver.get("https://ww4.banrisul.com.br/bvr/linkpagamento/TESTE/eoSjeWDQ3ijoeQ_a6xW6xJHN2bTCy5uidg9lBOq9aKopoHmxxQ");	
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
