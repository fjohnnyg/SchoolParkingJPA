package Entities;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class CarEntity extends VehicleEntity {

    public CarEntity(String make, String model, String licensePlate, VehicleType vehicleType) {
        setMake(make);
        setModel(model);
        setLicensePlate(licensePlate);
        setVehicleType(vehicleType);
    }

}