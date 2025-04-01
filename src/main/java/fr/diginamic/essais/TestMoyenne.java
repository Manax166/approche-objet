package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args){
        CalculMoyenne cm = new CalculMoyenne();
        System.out.println(cm.calcul());
        cm.ajout(2);
        cm.ajout(4);
        cm.ajout(8);
        System.out.println(cm.calcul());
        System.out.println();
    }
}
