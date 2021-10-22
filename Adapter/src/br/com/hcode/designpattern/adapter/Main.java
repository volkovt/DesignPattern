package br.com.hcode.designpattern.adapter;

import br.com.hcode.designpattern.adapter.adapters.PayonnerAdapter;
import br.com.hcode.designpattern.adapter.adapters.PicPayAdapter;
import br.com.hcode.designpattern.adapter.payoneer.IPayonnerPayments;
import br.com.hcode.designpattern.adapter.payoneer.Payonner;
import br.com.hcode.designpattern.adapter.paypal.IPaypalPayments;
import br.com.hcode.designpattern.adapter.paypal.Paypal;
import br.com.hcode.designpattern.adapter.picpay.IPicPayPayments;
import br.com.hcode.designpattern.adapter.picpay.PicPay;

public class Main {

    public static void main(String[] args) {
        /*IPayonnerPayments payonner = new Payonner();
        payonner.sendPayment();
        payonner.ReceivePayment();*/

        /*IPicPayPayments picpay = new PicPay();
        picpay.shippingPayment();
        picpay.obtainPayment();*/

        /*IPaypalPayments payment = new PayonnerAdapter(new Payonner());
        payment.paypalPayment();
        payment.paypalReceive();*/

        IPaypalPayments payment = new PicPayAdapter(new PicPay());
        payment.paypalPayment();
        payment.paypalReceive();
    }
}
