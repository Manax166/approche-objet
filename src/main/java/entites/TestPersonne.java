package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        AdressePostale ap1 = new AdressePostale("12", "Boulevard Machin", "59000", "Lille");
        Personne p = new Personne("Paul", "Ripault", ap1);
    }
}
