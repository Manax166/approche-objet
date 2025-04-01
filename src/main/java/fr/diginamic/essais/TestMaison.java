package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Salon;

public class TestMaison {
    public static void main(String[] args){
        Maison m = new Maison();
        m.ajouterPiece(new Chambre(15,1));
        m.ajouterPiece((new Salon(27, 0)));
    }
}
