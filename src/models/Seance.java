package models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Seance {

    private Film film;
    private Date date;

    private Time time;

    private Salle salle;

    private List<Reservation> reservations = new ArrayList<>();


    public Seance(Film fillm, Date date, Time time, Salle salle) {
        this.film = fillm;
        this.date = date;
        this.time = time;
        this.salle = salle;
    }

    public Seance(Film fillm, Date date, Time time, Salle salle, List<Reservation> reservations) {
        this.film = fillm;
        this.date = date;
        this.time = time;
        this.salle = salle;
        this.reservations = reservations;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation) {
        this.reservations.add(reservation);

    }

    public boolean isFull() {

        if (reservations.size() == this.salle.getCapacity()) {
            return true;
        } else {

            return false;
        }
    }
}
