package fr.diginamic.Builder;

import java.util.Optional;

public class ZooBuilder {

    private Zoo zoo;
    public ZooBuilder(String nomZoo) {
        this.zoo = new Zoo (nomZoo);
    }
    public ZooBuilder appendZone(String nomZone,int capaciteZone) {
        this.zoo.getZonesZoo().add(new Zone(nomZone, capaciteZone));
        return this;
    }
        public ZooBuilder appendAnimal(String nomZone, Animal animal) throws ZoneException {

            // Etape 1: retrouver la zone dans la liste de zones du zoo
            Optional<Zone> opt = zoo.getZonesZoo().stream().filter(z -> z.getNomZone().equals(nomZone)).findFirst();
    
            if (opt.isPresent()) {
                Zone z = opt.get();
                if (z.getAnimauxZone().size() < z.getCapaciteZone()) {
                    z.getAnimauxZone().add(animal);
                } else {
                    throw new ZoneException("La zone " + nomZone + " est pleine.");
                }
            } else {
                throw new ZoneException("La zone " + nomZone + " n'existe pas");
            }
    
            return this;
        }
    
        public Zoo get() {
            return this.zoo;
    }
}
