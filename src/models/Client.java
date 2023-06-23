package models;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private String name;

    private String email;

    private List<Reservation> reservations = new ArrayList<>();

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Client(String name, String email, List<Reservation> reservations) {
        this.name = name;
        this.email = email;
        this.reservations = reservations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public Reservation reserve(Seance seance, Salle salle, Place place) {
        if (!seance.getSalle().equals(salle)) {
            return null;
        }
        if (!seance.isFull()) {
            Reservation reservation = new Reservation(this, seance, salle, place);
            seance.addReservation(reservation);
            reservations.add(reservation);
            return reservation;
        } else {
            return null;
        }
    }
}
