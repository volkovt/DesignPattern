package br.com.hcode.designpattern.adapter.picpay;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IPicPayPayments {
    Token authToken();
    void shippingPayment();
    void obtainPayment();
}
