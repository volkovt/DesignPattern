package br.com.hcode.designpattern.adapter.adapters;

import br.com.hcode.designpattern.adapter.paypal.IPaypalPayments;
import br.com.hcode.designpattern.adapter.picpay.PicPay;
import br.com.hcode.designpattern.adapter.utils.Token;

public class PicPayAdapter implements IPaypalPayments {
    private Token token;
    private PicPay picPay;

    public PicPayAdapter(PicPay picPay) {
        this.picPay = picPay;
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void paypalPayment() {
        this.token = authToken();
        this.picPay.shippingPayment();
    }

    @Override
    public void paypalReceive() {
        this.picPay.obtainPayment();
    }
}
