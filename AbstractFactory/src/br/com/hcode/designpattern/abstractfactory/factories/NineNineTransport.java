package br.com.hcode.designpattern.abstractfactory.factories;

import br.com.hcode.designpattern.abstractfactory.aircrafts.Helicopter;
import br.com.hcode.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.designpattern.abstractfactory.boats.Boat;
import br.com.hcode.designpattern.abstractfactory.boats.IBoat;
import br.com.hcode.designpattern.abstractfactory.landvehicles.ILandVehicle;
import br.com.hcode.designpattern.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IBoat createTransportBoat() {
        return new Boat();
    }
}
