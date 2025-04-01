package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args){
        AdressePostale ap1 = new AdressePostale("12", "Boulevard Machin", "59000", "Lille");
        Personne p = new Personne("Ripault", "Paul", ap1);
        Personne p2 = new Personne("Ripault", "Paul");
        AdressePostale ap2 = new AdressePostale("102TER", "Avenue Truc", "60290", "Cauffry");
        p2.setAdresse(ap2);
    }
}
