package utils.model;

import org.apache.commons.lang3.StringUtils;

import utils.Formatador;

public class CartoesPgto {

	protected long numeroCartao;
	protected String nomeNoCartao;
	protected String dataValidade;
	protected String cvv;
	protected String cep;
	protected String numeroResidencia;
	
	public CartoesPgto(long numeroCartao, String nomeNoCartao, String dataValidade, String cvv, String cep, String numeroResidencia) {
        this.numeroCartao = numeroCartao;
        this.nomeNoCartao = nomeNoCartao;
        this.dataValidade = dataValidade;
        this.cvv = cvv;
        this.cep = cep;
        this.numeroResidencia = numeroResidencia;
    }
	
	public long obterNumeroCartao() {
        return numeroCartao;
    }
     public String NumeroCartaoFormatado() {
         String str = StringUtils.leftPad(String.valueOf(numeroCartao), 16, "0");
         return Formatador.formatarNumCartao(str);
     }
     
     public String obterNomeNoCartao() {
         return nomeNoCartao;
     }
     
     public String obterDataValidade() {
         return dataValidade;
     }
     
     public String obterCvv() {
         return cvv;
     }
     
     public String obterCep() {
         return cep;
     }
     public String obterNumeroResidencial() {
         return numeroResidencia;
     }
}
