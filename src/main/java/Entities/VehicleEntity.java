package Entities;

import javax.persistence.*;

@Entity
@Table(name = "vehicles")
public class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Person owner;

    @OneToOne
    @JoinColumn(name = "parkingSpot_id")
    private ParkingSpotEntity parkingSpot;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;

    private String make;

    private String model;

    @Column(unique = true)
    private String licensePlate;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public ParkingSpotEntity getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpotEntity parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
