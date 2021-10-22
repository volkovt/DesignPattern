package br.com.hcode.designpattern.adapter.payoneer;

import br.com.hcode.designpattern.adapter.utils.Token;

public class Payonner implements IPayonnerPayments{
    private Token token;

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos via Payonner");
    }

    @Override
    public void ReceivePayment() {
        System.out.println("Enviando pagamentos via Payonner");
    }
}
