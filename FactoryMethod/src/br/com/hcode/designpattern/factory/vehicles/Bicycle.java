package br.com.hcode.designpattern.factory.vehicles;

public class Bicycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciamos a rota");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida");
    }
}
