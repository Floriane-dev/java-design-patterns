package fr.diginamic.Builder;

import java.util.List;

public class Zoo {
    private String nomZoo;
    private List<Zone> ZonesZoo;

    public Zoo(String nomZoo){

    }
    public String getNomZoo() {
        return nomZoo;
    }

    public void setNomZoo(String nomZoo) {
        this.nomZoo = nomZoo;
    }

    public List<Zone> getZonesZoo() {
        return ZonesZoo;
    }
    public void setZonesZoo(List<Zone> zone){
        this.ZonesZoo = zone;
    }

    
}
