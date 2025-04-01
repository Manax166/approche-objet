package fr.diginamic.recensement;

import java.util.Scanner;

public class PopDepartementService extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Saisissez le numéro de département");
        String codeDept = scanner.next();
        int result = departementTotalCount(recensement, codeDept);
        System.out.println("Le departement n°" + codeDept + " possède un total de " + result + " habitants");
    }
    public int departementTotalCount(Recensement r, String codeDept){
        int totalPop = 0;
        for(Ville ville : r.getListVilles()){
            if(ville.getCodeDepartement().equals(codeDept)) totalPop += ville.getPopTotale();
        }
        return totalPop;
    }
}
