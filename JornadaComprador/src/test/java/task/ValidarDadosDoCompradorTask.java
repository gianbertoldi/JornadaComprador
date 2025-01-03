package task;

import org.openqa.selenium.WebDriver;

import page.DadosCompradorPage;
import page.DadosVendaPage;
import utils.SeleniumActions;
import utils.enuns.CartoesPgtoEnum;
import validations.DadosVendaValidations;
import validations.GenericValidations;

public class ValidarDadosDoCompradorTask extends SeleniumActions {

	WebDriver driver;
	DadosVendaPage dadoVendaPage;
	DadosCompradorPage compradorPage;
	DadosVendaValidations dadosVendaValidacao;
	GenericValidations genericValidations;
	

	public ValidarDadosDoCompradorTask(WebDriver driver) {
		super(driver);
		this.driver = driver;
		genericValidations = new GenericValidations(driver);
		dadoVendaPage = new DadosVendaPage(driver, dadoVendaPage);
		compradorPage = new DadosCompradorPage(driver);
		dadosVendaValidacao = new DadosVendaValidations(driver);
	}

	public void validaDadoVenda() {
		dadosVendaValidacao.validaDadosVenda();
		dadoVendaPage.btnContinuar();
	}

	public void validaDadosComprador(String nome, String cpf, String celular, String email) {
		inserirDadosComprador(nome, cpf, celular, email);
	}

	public void validaMensagemErroCampoNomeVazio(String nome) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputNomeComprador(nome);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroNome(), "Insira o nome");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroApenasUmNome(String nome) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputNomeComprador(nome);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroNome(), "Insira nome e sobrenome");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroSemCpf(String cpf) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputCpfComprador(cpf);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroCpf(), "Insira o CPF");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroCpfInvalido(String cpf) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputCpfComprador(cpf);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroCpf(), "Insira um CPF válido");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroSemCelular(String celular) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputCelularComprador(celular);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroCelular(), "Insira o celular");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroCelularInvalido(String celular) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputCelularComprador(celular);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroCelular(), "Insira um celular válido");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroSemEmail(String email) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputEmailComprador(email);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroEmail(), "Insira o e-mail");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void validaMensagemErroEmailInvalido(String email) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputEmailComprador(email);
		tirarFocoDoElementoAtual();
		genericValidations.validaTextoEsperadoAtual(compradorPage.txtErroEmail(), "Insira um e-mail válido");
		genericValidations.estaDesabilitado(compradorPage.btnContinuar());
	}

	public void fazerPagamentoComSucesso(String nome, String cpf, String celular, String email, CartoesPgtoEnum cartoes) {
		inserirDadosComprador(nome, cpf, celular, email);
		inserirDadosPgto(cartoes);
	}

	private void inserirDadosComprador(String nome, String cpf, String celular, String email) {
		dadoVendaPage.btnContinuar();
		compradorPage.inputNomeComprador(nome);
		compradorPage.inputCpfComprador(cpf);
		compradorPage.inputCelularComprador(celular);
		compradorPage.inputEmailComprador(email);
		compradorPage.clicarContinuar();
	}
	private void inserirDadosPgto(CartoesPgtoEnum cartoes) {
		
	}
}
