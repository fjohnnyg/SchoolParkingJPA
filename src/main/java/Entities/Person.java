package Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE)
    @Column (name = "id", nullable = false)
    private int id;
    private String name;

    @OneToMany(mappedBy = "owner", targetEntity = VehicleEntity.class)
    private List<VehicleEntity> vehicles = new ArrayList<>();

    public Person() {
    }

    public Person(int personId, String name) {
        this.id = personId;
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public List<VehicleEntity> getVehicle() {
        return vehicles;
    }

    public void setVehicle(List<VehicleEntity> vehicle) {
        this.vehicles = vehicle;
        this.vehicles.forEach(v -> v.setOwner(this));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
