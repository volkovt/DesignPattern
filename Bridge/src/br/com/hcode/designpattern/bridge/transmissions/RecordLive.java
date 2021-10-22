package br.com.hcode.designpattern.bridge.transmissions;

import br.com.hcode.designpattern.bridge.platforms.IPlatform;

public class RecordLive extends Live {
    public RecordLive(IPlatform platform) {
        super(platform);
    }

    public void recordedLive(){
        System.out.println("Transmissão está sendo gravada.");
    }
}
