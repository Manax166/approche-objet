package fr.diginamic.recensement;

import java.io.InputStream;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args){
        Recensement r = new Recensement();
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        while(!exit){
            System.out.println("Choisissez une option parmi les suivantes :");
            System.out.println("1. Population d’une ville donnée");
            System.out.println("2. Population d’un département donné");
            System.out.println("3. Population d’une région donnée");
            System.out.println("4. Afficher les 10 régions les plus peuplées");
            System.out.println("5. Afficher les 10 départements les plus peuplés");
            System.out.println("6. Afficher les 10 villes les plus peuplées d’un département");
            System.out.println("7. Afficher les 10 villes les plus peuplées d’une région");
            System.out.println("8. Afficher les 10 villes les plus peuplées de France");
            System.out.println("9. Sortir");
            switch (sc.nextInt()){
                case 1 :
                    new PopVilleService().traiter(r, sc);
                    break;
                case 2 :
                    new PopDepartementService().traiter(r,sc);
                    break;
                case 3 :
                    new PopRegionService().traiter(r, sc);
                    break;
                case 4 :
                    new RegionsPlusPeupleesService().traiter(r, sc);
                    break;
                case 5 :
                    new DepartementPlusPeuplesService().traiter(r, sc);
                    break;
                case 6 :
                    new VillePlusPeupleesDeptService().traiter(r, sc);
                    break;
                case 7 :
                    new VillePlusPeupleesRegionService().traiter(r, sc);
                    break;
                case 8 :
                    new VilleplusPeupleesFranceService().traiter(r, sc);
                    break;
                case 9 :
                    exit = true;
            }
        }
    }
}
