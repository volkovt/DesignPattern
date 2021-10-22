package br.com.hcode.designpattern.adapter.payoneer;

import br.com.hcode.designpattern.adapter.utils.Token;

public interface IPayonnerPayments {
    Token authToken();
    void sendPayment();
    void ReceivePayment();
}
