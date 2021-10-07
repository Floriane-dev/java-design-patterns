package fr.diginamic.Composite;

import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.STRING;

public class Service implements IElement {
    
    // Attributs
    private String nom;
    private List<IElement> employeServices = new ArrayList<>();         

    //Constructeur
    public Service(String nom) {
        this.nom = nom;
    
    }
   
    public Service(List<IElement> myList) {
        this.employeServices = myList;

    }
    //Méthodes
    public List<IElement> getemployeServices() {
        return this.employeServices;

    }

    public void setemployeServices(List<IElement> myNewList) {
        this.employeServices = myNewList;
    
    }     
    public Double calculerSalaire() {
        return this.employeServices.stream().mapToDouble(element -> element.calculerSalaire()).sum();
                                //stream : recupère toute la liste , map :applique la fonction sur tout (stream),
                                // element(nom): quelle fonction appliquer sur les élements, sum : additionne tout
    }


}



