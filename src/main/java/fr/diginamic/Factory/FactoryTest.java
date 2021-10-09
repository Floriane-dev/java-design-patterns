package fr.diginamic.Factory;

public class FactoryTest {
    
    public static void main(String[] args) {
        ObjetConnecte Tb = EFactory.getInstance(EFactory.Tablette, 3000);
        System.out.println("\n" + "Tablette : " + Tb);
    }
}
