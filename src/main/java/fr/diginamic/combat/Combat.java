package fr.diginamic.combat;

public class Combat {
    Joueur joueur;
    Monstre monstre;

    public Combat(Joueur joueur, Monstre monstre) {
        this.joueur = joueur;
        this.monstre = monstre;
    }
    public boolean resolveBattle(){
        while(joueur.getPointsDeSante()>0 && monstre.getPointsDeSante()>0){
            int forceJoueur = joueur.getForce() + (int) (1 + Math.random()*10);
            int forceMonstre = monstre.getForce() + (int) (1 + Math.random()*10);
            if(forceJoueur >= forceMonstre) monstre.setPointsDeSante(monstre.getPointsDeSante() - (forceJoueur-forceMonstre));
            else joueur.setPointsDeSante(monstre.getPointsDeSante() - (forceMonstre-forceJoueur));
        }
        if(joueur.getPointsDeSante()>0){
            if(joueur.getTemps()>0) joueur.setTemps(joueur.getTemps()-1);
            joueur.setScore(monstre.getScore());
            return true;
        }
        return false;
    }
}
