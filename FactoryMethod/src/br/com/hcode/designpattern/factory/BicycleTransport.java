package br.com.hcode.designpattern.factory;

import br.com.hcode.designpattern.factory.vehicles.Bicycle;
import br.com.hcode.designpattern.factory.vehicles.IVehicle;

public class BicycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
       return new Bicycle();
    }
}
