package fr.diginamic.Composite;

public class testCoposite {
    
    public static void main(String[] args) {
        
        Service france = new Service("France");
        Employe floriane = new Employe(3000.0);
        france.getemployeServices().add(floriane);
        france.calculerSalaire();
        System.out.println("Le salaire de tous les acteurs est " + france.calculerSalaire());

    }
}
