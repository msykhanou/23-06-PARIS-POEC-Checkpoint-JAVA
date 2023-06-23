package models;

public class Reservation {
    private Client client;

    private Seance seance;

    private Salle salle;

    private  Place place;

    public Reservation(Client client, Seance seance, Salle salle, Place place) {
        this.client = client;
        this.seance = seance;
        this.salle = salle;
        this.place = place;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }

    public Salle getSalle() {
        return salle;
    }

    public void setSalle(Salle salle) {
        this.salle = salle;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }
}
