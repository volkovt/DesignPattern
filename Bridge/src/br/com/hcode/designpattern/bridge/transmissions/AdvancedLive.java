package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.platforms.IPlatform;

public class AdvancedLive extends Live{
    public AdvancedLive(IPlatform platform) {
        super(platform);
    }

    public void subtitles(){
        System.out.println("Legendas ativadas na Transmissão.");
    }

    public void comments(){
        System.out.println("Comentários ativados na Transmissão.");
    }
}
