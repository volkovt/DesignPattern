package br.com.hcode.designpattern.adapter.adapters;

import br.com.hcode.designpattern.adapter.payoneer.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPaypalPayments;
import br.com.hcode.designpattern.adapter.utils.Token;

public class PayonnerAdapter implements IPaypalPayments {
    private Token token;
    private Payonner payonner;

    public PayonnerAdapter(Payonner payonner) {
        this.payonner = payonner;
        System.out.println("Adaptando o payonner utilizando os métodos padrões do Paypal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.payonner.sendPayment();
    }

    @Override
    public void paypalReceive() {
        this.payonner.ReceivePayment();
    }
}
