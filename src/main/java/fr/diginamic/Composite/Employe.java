package fr.diginamic.Composite;

public class Employe implements IElement {
    private Double salaire;
    private String nom;
    private String prenom;

    //création du constructeur
    public Employe(Double salaire, String nom, String prenom){
        this.salaire = salaire;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Employe(Double salaire){
        this.salaire = salaire;
    
    }
    // getter et setter
    public Double getSalaire(){
        return salaire;
    }
    public void setSalaire(Double salaire){
        this.salaire = salaire;
    }
    // obliger de faire ce que l'interface a demander
    public Double calculerSalaire() {
        // return this.salaire;
        return this.getSalaire();
    }
}
