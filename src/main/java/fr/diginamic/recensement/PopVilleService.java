package fr.diginamic.recensement;

import java.util.Scanner;

public class PopVilleService extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Saisissez le nom de la ville");
        String nomVille = scanner.next().toLowerCase();
        int result = popVilleCount(recensement, nomVille);
        System.out.println("La population de " +nomVille + " est de " + result + " habitants");
    }
    public int popVilleCount(Recensement r, String nomVille) {
        for(Ville ville : r.getListVilles()){
            if(nomVille.equals(ville.getNomCommune().toLowerCase())) return ville.getPopTotale();
        }
        return 0;
    }
}
