package fr.diginamic.recensement;

import java.util.Scanner;

public class PopRegionService extends MenuService {

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Saisissez le numéro de région");
        int codeRegion = scanner.nextInt();
        int result = regionTotalCount(recensement, codeRegion);
        System.out.println("La région n°" + codeRegion + " possède un total de " + result + " habitants");

    }
    public  int regionTotalCount(Recensement r, int codeRegion){
        int totalPop = 0;
        for(Ville ville : r.getListVilles()){
            if(ville.getCodeRegion() == codeRegion) totalPop += ville.getPopTotale();
        }
        return totalPop;
    }
}
