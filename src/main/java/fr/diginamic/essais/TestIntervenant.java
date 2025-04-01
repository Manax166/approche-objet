package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {
    public static void main(String[] args){
        Salarie s = new Salarie("Ripault", "Paul", 2400);
        Pigiste p = new Pigiste("Ripault", "Paul", 48, 15);
        s.afficherDonnees();
        p.afficherDonnees();
    }
}
