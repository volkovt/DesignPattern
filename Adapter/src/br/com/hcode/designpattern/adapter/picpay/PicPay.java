package br.com.hcode.designpattern.adapter.picpay;

import br.com.hcode.designpattern.adapter.utils.Token;

public class PicPay implements IPicPayPayments {
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void shippingPayment() {
        this.token = authToken();
        System.out.println("Pagamento via picpay sendo enviado");
    }

    @Override
    public void obtainPayment() {
        System.out.println("Recebendo via picpay o pagamento");
    }
}
