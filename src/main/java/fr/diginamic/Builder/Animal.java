package fr.diginamic.Builder;

/* Le mécanisme des classes abstraites permet de définir des comportements (méthodes) 
    dont l'implémentation (le code dans la méthode) se fait dans les classes filles. 
    Ainsi, on a l'assurance que les classes filles respecteront le contrat défini par 
    la classe mère abstraite. Ce contrat est une interface de programmation. 
    
    */
public abstract class Animal {
    private String nom;

    public Animal(String nom) {
    super();    
    this.nom = nom;
    }
    
    //getter et setter
    public String getNomAnimal() {
        return nom;
    }

    public void setNomAnimal(String nom) {
        this.nom = nom;
    }
    
}
