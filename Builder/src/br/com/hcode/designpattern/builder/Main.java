package br.com.hcode.designpattern.builder;

import br.com.hcode.designpattern.builder.builders.CarBuilder;
import br.com.hcode.designpattern.builder.builders.TruckBuilder;
import br.com.hcode.designpattern.builder.cars.Car;
import br.com.hcode.designpattern.builder.cars.Truck;
import br.com.hcode.designpattern.builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");


        director.constructPorsche(builder);
        Car porsche = builder.getResult();
        System.out.println(porsche.result() + " produzido com sucesso!");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);
        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result() + " produzido com sucesso!");
    }
}
