package fr.diginamic.essais;

import entites.Theatre;

public class TestTheatre {
    public static void main(String[] args){
        Theatre t = new Theatre("TEST", 150);
        t.inscrire(50, 7.5);
        System.out.println(t.getTotalRecette());
        t.inscrire(90, 7.5);
        System.out.println(t.getTotalRecette());
        t.inscrire(20, 8);
        System.out.println(t.getTotalRecette());
        t.inscrire(3, 6);
        System.out.println(t.getTotalRecette());
        System.out.println(t.getTotalClients());
    }
}
