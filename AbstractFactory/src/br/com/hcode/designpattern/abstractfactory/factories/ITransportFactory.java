package br.com.hcode.designpattern.abstractfactory.factories;

import br.com.hcode.designpattern.abstractfactory.aircrafts.IAircraft;
import br.com.hcode.designpattern.abstractfactory.boats.IBoat;
import br.com.hcode.designpattern.abstractfactory.landvehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
