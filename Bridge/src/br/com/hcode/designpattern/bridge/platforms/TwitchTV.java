package br.com.hcode.designpattern.bridge.platforms;

public class TwitchTV implements IPlatform{

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão Iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: configurando RMPT.");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: validando o canal.");
    }
}
