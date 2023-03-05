package Entities;

import javax.persistence.*;

@Entity
@Table (name = "parking_spots")
public class ParkingSpotEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne(mappedBy = "parkingSpot")
    private VehicleEntity vehicle;
}
