import models.*;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
   // Création du cinéma
        Cinema cinema = new Cinema("Cineplex", "123 Rue de Cinema");
        System.out.println("Cinema created: " + cinema);

        // Création des place
        List<String> places = new ArrayList<>();
        String[] rows = {"A", "B", "C", "D", "E", "F", "G"};
        for(String row : rows) {
            for(int i = 1; i <= 10; i++) {
                places.add(row + i);
            }
        }
        System.out.println("places :" + places);
        Salle salle1 = new Salle(70, places);
        Salle salle2 = new Salle(70, places);
        System.out.println("Salles created: " + salle1 + ", " + salle2);

        // Ajout des salles au cinéma
        cinema.addSalle(salle1);
        cinema.addSalle(salle2);
        System.out.println("Salles added to the cinema.");

        // Création des films
        Film film1 = new Film("Titanic", "Un bateau qui coule", new Date());
        Film film2 = new Film("Inception", "Un voyage dans les rêves", new Date());
        System.out.println("Films created: " + film1 + ", " + film2);

        // Ajout des films au cinéma
        cinema.addFilm(film1);
        cinema.addFilm(film2);
        System.out.println("Films added to the cinema.");

        // Création des séances
        Seance seance1 = new Seance(
                film1,
                new Date(2023, 6,24),
                new Time(19, 55, 00),
                salle1
        );
        Seance seance2 = new Seance(
                film2,
                new Date(2023, 6,24),
                new Time(19, 55, 00),
                salle2
        );
        System.out.println("Seances created: " + seance1 + ", " + seance2);

        // Programmation des séances au cinéma
        cinema.scheduleSeance(film1, new Date(), new Time(19, 55, 00), salle1);
        cinema.scheduleSeance(film2, new Date(), new Time(19, 55, 00), salle2);
        System.out.println("Seances scheduled in the cinema.");

        // Récupération de la liste de films du cinéma
        List<Film> films = cinema.getFilms();
        System.out.println("List of films in the cinema: " + films);

        // Récupération de la liste des séances pour un film
        List<Seance> seancesForFilm1 = cinema.getAllSeancesForFilmOnDate(film1, new Date());
        System.out.println("List of seances for film " + film1 + ": " + seancesForFilm1);

        // Création d'un client
        Client client1 = new Client("John Doe", "john.doe@example.com");
        System.out.println("Client created: " + client1);

        // Réservation par le client
        Place place = new Place("A1");
        Reservation reservation1 = client1.reserve(seance1, salle1, place);
        if (reservation1 != null) {
            System.out.println("Reservation made by client: " + reservation1);
        } else {
            System.out.println("Reservation failed. The seance is full.");
        }

        // Bonus: Création d'une place et vérification de sa disponibilité
        List<Place> newPlaces = new ArrayList<>();
        String[] newRows = {"A", "B", "C", "D", "E", "F", "G"};
        for(String row : newRows) {
            for(int i = 1; i <= 10; i++) {
                newPlaces.add(new Place(row + i));
            }
        }

        Place place1 = new Place("A1");
        place1.getIsOccupied().put(seance1, true);
        System.out.println("Place created and set as occupied for the seance: " + place1);

        if (place1.getIsOccupied().get(seance1)) {
            System.out.println("The place is occupied for this seance.");
        } else {
            System.out.println("The place is free for this seance.");
        }

    }

}
