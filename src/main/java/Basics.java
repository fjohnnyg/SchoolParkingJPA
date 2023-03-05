import Entities.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Basics {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("school_parking");
        EntityManager em = emf.createEntityManager();

        System.out.println("Insert new teachers");
        em.getTransaction().begin();
        TeacherEntity e1 = new TeacherEntity("Mariana Azevedo", "Art History");
        TeacherEntity e2 = new TeacherEntity("Irene Ferreira", "Special Needs");
        TeacherEntity e3 = new TeacherEntity("Dário Gaspar", "Physical Education");

        em.persist(e1);
        em.persist(e2);
        em.persist(e3);

        em.getTransaction().commit();

        System.out.println("Insert new vehicles");
        em.getTransaction().begin();
        CarEntity c1 = new CarEntity("Renault", "Twingo", "12-OH-93", VehicleType.CAR);
        CarEntity c2 = new CarEntity("Renault", "Captur", "45-VB-67", VehicleType.CAR);
        CarEntity c3 = new CarEntity("Alfa Romeo", "Giulia", "34-JD-89", VehicleType.CAR);
        MotorcycleEntity m1 = new MotorcycleEntity("Triunph", "Tiger", "59-LK-78", VehicleType.MOTORCYCLE);

        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(m1);

        em.getTransaction().commit();

        System.out.println("Insert new parking spot");
        em.getTransaction().begin();

        for (int i = 0; i < 20; i++) {
            ParkingSpotEntity ps = new ParkingSpotEntity();
            em.persist(ps);
        }

        em.getTransaction().commit();

        System.out.println("Setting vehicles owner");
        em.getTransaction().begin();

        c1.setOwner(e1);
        c2.setOwner(e2);
        c3.setOwner(e3);
        m1.setOwner(e3);

        em.getTransaction().commit();

        /*System.out.println("Assign vehicles to parking spots");
        em.getTransaction().begin();

        ps1.setVehicle(c1);
        ps2.setVehicle(c2);
        ps3.setVehicle(c3);
        ps4.setVehicle(m1);

        em.getTransaction().commit();*/
    }
}
