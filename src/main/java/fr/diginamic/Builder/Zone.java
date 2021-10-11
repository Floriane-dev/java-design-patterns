package fr.diginamic.Builder;

import java.util.ArrayList;
import java.util.List;

public class Zone {
    private String nomZone;
    private int capaciteZone;
    private List<Animal> animauxZone;
    
    //Création du constructeur
    public Zone(String nomZone, int capaciteZone) {
        this.nomZone = nomZone;
        this.capaciteZone = capaciteZone;
        this.animauxZone = new ArrayList<Animal>();
    }
    //getter et setter
    public String getNomZone() {
        return nomZone;
    }

    public void setNomZone(String nomZone) {
        this.nomZone = nomZone;
    }

    public int getCapaciteZone() {
        return capaciteZone;
    }

    public void setCapaciteZone(int capaciteZone) {
        this.capaciteZone = capaciteZone;
    }

    public List<Animal> getAnimauxZone() {
        return animauxZone;
    }

    public void setAnimauxZone(List<Animal> listeAnimal) {
        this.animauxZone = listeAnimal;
    }

    
}
