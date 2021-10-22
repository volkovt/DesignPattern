package br.com.hcode.designpattern.bridge;

import br.com.hcode.designpattern.bridge.platforms.*;
import br.com.hcode.designpattern.bridge.transmissions.AdvancedLive;
import br.com.hcode.designpattern.bridge.transmissions.Live;
import br.com.hcode.designpattern.bridge.transmissions.RecordLive;

public class Main {

    public static void main(String[] args) {
        startLive(new Youtube());
        startLive(new TwitchTV());
        startLive(new Facebook());
        startLive(new DisneyPlus());
    }

    public static void startLive(IPlatform platform) {
        /*System.out.println("...aguarde!");
        Live live = new Live(platform);
        live.broadcasting();
        live.result();*/

        /*System.out.println("Transmissão avançada...aguarde!");
        AdvancedLive advancedLive = new AdvancedLive(platform);
        advancedLive.broadcasting();
        advancedLive.comments();
        advancedLive.subtitles();
        advancedLive.result();*/

        System.out.println("Transmissão avançada...aguarde!");
        RecordLive recordLive = new RecordLive(platform);
        recordLive.broadcasting();
        recordLive.recordedLive();
        recordLive.result();
    }
}
