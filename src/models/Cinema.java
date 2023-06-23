package models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {
    private String name;
    private String adresse;
    private List<Film> films = new ArrayList<>();

    private List<Seance> seances = new ArrayList<>();

    private List<Salle> salles = new ArrayList<>();


    public Cinema(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public Cinema(String name, String adresse, List<Film> films, List<Seance> seances, List<Salle> salles) {
        this.name = name;
        this.adresse = adresse;
        this.films = films;
        this.seances = seances;
        this.salles = salles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Seance> getSeances() {
        return seances;
    }

    public void setSeances(List<Seance> seances) {
        this.seances = seances;
    }

    public List<Salle> getSalles() {
        return salles;
    }

    public void setSalles(List<Salle> salles) {
        this.salles = salles;
    }

    public void addFilm(Film film) {
        this.films.add(film);

    }

    public void  removeFilm(Film film){
        this.films.remove(film);

    }
    public void scheduleSeance(Film film, Date date , Time heure, Salle salle){
        Seance seance = new Seance(film,date , heure , salle,new ArrayList<>());
        this.seances.add(seance);

    }

    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date){
        List<Seance> result = new ArrayList<>();
        for(Seance seance : seances){
            if(seance.getFilm().getName().equals(film.getName()) && date.compareTo(seance.getDate())== 0 ){
                result.add(seance);
            }
        }
        return result;
    }

    public void addSalle(Salle salle1) {
        this.salles.add(salle1);
    }
}
