package models;

import java.util.HashMap;
import java.util.Map;

public class Place {
    private String placeNumber;

    private Map<Seance, Boolean> isOccupied= new HashMap<>();

    public Place(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    public Place(String placeNumber, Map<Seance, Boolean> isOccupied) {
        this.placeNumber = placeNumber;
        this.isOccupied = isOccupied;
    }

    public String getPlaceNumber() {
        return placeNumber;
    }

    public void setPlaceNumber(String placeNumber) {
        this.placeNumber = placeNumber;
    }

    public Map<Seance, Boolean> getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(Map<Seance, Boolean> isOccupied) {
        this.isOccupied = isOccupied;
    }
}
