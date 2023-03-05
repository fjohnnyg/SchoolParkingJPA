package Entities;

import javax.persistence.*;

@Entity
@Table(name = "motorcycles")
public class MotorcycleEntity extends VehicleEntity {

    public MotorcycleEntity(String make, String model, String licensePlate, VehicleType vehicleType) {
        setMake(make);
        setModel(model);
        setLicensePlate(licensePlate);
        setVehicleType(vehicleType);
    }

}
