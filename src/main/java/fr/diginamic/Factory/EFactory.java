package fr.diginamic.Factory;
/* Réalisez la méthode de la Factory qui créée une instance d’objet en fonction 
du type d’objet connecté passé en paramètre (énumération) 
et du second paramètre permettant de valoriser l’attribut limiteVolts.
*/

public enum EFactory {
    EnceinteConnecte,Tablette,TelephonePortable;

public static ObjetConnecte getInstance(EFactory typeObj, int limiteVolts){
ObjetConnecte objetToReturn = null;

switch (typeObj) {
    case EnceinteConnecte:
    objetToReturn = new EnceinteConnecte(limiteVolts);
    break;
    
    case Tablette:
    objetToReturn = new Tablette(limiteVolts);
    break;

    case TelephonePortable:
    objetToReturn = new TelephonePortable(limiteVolts);
    break;

    default :
    break;

}
return objetToReturn;
}

 
}
