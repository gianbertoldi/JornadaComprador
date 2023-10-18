package utils.enuns;

import utils.model.CartoesPgto;

public enum CartoesPgtoEnum {


    
    CREDITO_MASTERCARD{
        public CartoesPgto obterNumeroCartao() {
            return new CartoesPgto(Long.parseLong("5204740000001002"), "Gera Qr Code", "092030", "191", "91787866", "181");
        }  
    },
    CREDITO_VISA{
        public CartoesPgto obterNumeroCartao() {
            return new CartoesPgto(Long.parseLong("4761120000000148"), "Gera Qr Code", "092031", "200", "91787866", "181");
        }  
    },
    CREDITO_ELO{
        public CartoesPgto obterNumeroCartao() {
            return new CartoesPgto(Long.parseLong("5067230000009011"), "Gera Qr Code", "092031", "200", "91787866", "181");
        } 
    },
    DEBITO_MASTERCARD{
        public CartoesPgto obterNumeroCartao() {
            return new CartoesPgto(Long.parseLong("5033961989909166"), "Gera Qr Code", "092031", "200", "91787866", "181");
        }
    },
    DEBITO_VISA{
        public CartoesPgto obterNumeroCartao() {
            return new CartoesPgto(Long.parseLong("4012001037141112"), "Gera Qr Code", "092031", "200", "91787866", "181");
        }
    },
    DEBITO_ELO{
        public CartoesPgto obterNumeroCartao() {
            return new CartoesPgto(Long.parseLong("5067230000009029"), "Gera Qr Code", "092031", "200", "91787866", "181");
        }
    };
    
    public abstract CartoesPgto obterNumeroCartao();

}
