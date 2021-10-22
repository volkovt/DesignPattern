package br.com.hcode.designpattern.bridge.platforms;

public class DisneyPlus implements IPlatform {
    public DisneyPlus() {
        configureRMTP();
        System.out.println("DisneyPlus: Transmissão Iniciada.");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DisneyPlus: configurando RMPT.");
    }

    @Override
    public void authToken() {
        System.out.println("DisneyPlus: validando o canal.");
    }
}
