package fr.diginamic.Factory;

public abstract class ObjetConnecte {
    private int limiteVolts;

    //création du constructeur
    public ObjetConnecte(int limiteVolts) {
        this.limiteVolts = limiteVolts;
    } 


//getter et setter
public int getLimiteVolts(){
    return limiteVolts;

}
public void setLimiteVolts(int limiteVolts) {
    this.limiteVolts = limiteVolts;
}


@Override
public String toString() {
    return "ObjetConnecte [limiteVolts=" + limiteVolts + "]";
}

}
