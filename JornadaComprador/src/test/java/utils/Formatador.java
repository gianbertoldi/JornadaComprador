package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.lang3.StringUtils;

public class Formatador {

	public static String obterDataAtualFormatadaDetalhamentoLink(LocalDateTime data) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH:mm");
        return data.format(formato);
    }
	
	public static String formatarNumCartao(String cartao) {
        cartao = Formatador.preencherAEsquerda(cartao, 16, "0");
        return cartao.replaceAll("(\\d{4})(\\d{4})(\\d{4})(\\d{4})", "$1 $2 $3 $4");
    }
	
    public static String preencherAEsquerda(String valor, int tamanho, String caractere) {
        return StringUtils.leftPad(valor, tamanho, caractere);
    }
}
