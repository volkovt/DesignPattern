package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.platforms.IPlatform;

public class Live implements ITransmissions{
    protected IPlatform platform;

    public Live() {
    }

    public Live(IPlatform platform) {
        this.platform = platform;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a transmissão.");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}
