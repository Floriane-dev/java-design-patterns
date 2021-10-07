package fr.diginamic.tp_grasps.Factory;

import java.time.LocalDateTime;

import fr.diginamic.singleton.utils.DateUtils;
import fr.diginamic.tp_grasps.beans.Client;
import fr.diginamic.tp_grasps.beans.Reservation;
import fr.diginamic.tp_grasps.beans.TypeReservation;

public class ReservationFactory {
    public static Reservation getInstance(String dateReservationStr, int nbPlaces,Client client, TypeReservation typeReservation) {
    
        //1) transforme une date en chaine (string)
        LocalDateTime dateReservation = DateUtils.toDate(dateReservationStr);

        //2) cRÉATION DE LA RÉSERVATION
        Reservation reservation = new Reservation(dateReservation);
        reservation.setNbPlaces(nbPlaces);
        reservation.setClient(client);

        //3) Calcul du montant total de la réservation qui dépend :
        // 
		//    - du nombre de places
		//    - de la réduction qui s'applique si le client est premium ou non
		reservation.setTotal(getcalculmontantreservation(typeReservation, client, nbPlaces));
       
        //4) Ajout de la réservation au client
        client.getReservations().add(reservation);
        return reservation;
    }
    public static double getcalculmontantreservation(TypeReservation type, Client client, int nbPlaces){
        double total = type.getMontant() * nbPlaces;
        if (client.isPremium()){
            total = total * (1 - type.getReductionPourcent()/100.0);
        }
        return total;
    }
}
