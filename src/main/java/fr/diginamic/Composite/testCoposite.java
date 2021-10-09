package fr.diginamic.Composite;

public class testCoposite {
    
    public static void main(String[] args) {
        
        Service france = new Service("France");
        Employe floriane = new Employe(3000.0);
        france.getemployeServices().add(floriane);
        france.calculerSalaire();
        System.out.println("Le salaire de tous les acteurs est " + france.calculerSalaire());

/*
        Service DSIN = new Service("DSIN");
        Employe Cecile = new Employe(10000.0);
        Employe Bilel = new Employe(8000.0);
        DSIN.getemployeServices().add(Cecile);
        DSIN.getemployeServices().add(Bilel);

        Service BigData = new Service("Big Data");
        Employe JB = new Employe(7500.0);
        Employe Jane = new Employe(3500.0);
        BigData.getemployeServices().add(JB);
        BigData.getemployeServices().add(Jane);

        Service JavaDev = new Service("Java Dev");
        Employe Kevin = new Employe(7500.0);
        Employe Paul = new Employe(3500.0);
        JavaDev.getemployeServices().add(Kevin);
        JavaDev.getemployeServices().add(Paul);

        System.out.println("Le salaire de tous les acteurs est de " + DSIN.calculerSalaire() + BigData.calculerSalaire() + JavaDev.calculerSalaire());
        */
    }
}
