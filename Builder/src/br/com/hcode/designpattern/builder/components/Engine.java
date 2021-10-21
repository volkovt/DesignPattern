package br.com.hcode.designpattern.builder.components;

public class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower(){
        return this.power;
    }
}
