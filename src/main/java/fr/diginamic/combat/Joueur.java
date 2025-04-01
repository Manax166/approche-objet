package fr.diginamic.combat;

public class Joueur extends Personnage{
    private int score;
    private int bonus;
    private int temps;

    public Joueur() {
        super(0, 0);
        int force = (int) (12 + Math.random()*7);
        int sante = (int) (20 + Math.random()*31);
        this.setForce(force);
        this.setPointsDeSante(sante);
        this.score = 0;
    }

    @Override
    public int getForce() {
        return super.getForce()+bonus;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getTemps() {
        return temps;
    }

    public void setTemps(int temps) {
        this.temps = temps;
        if(this.temps == 0) setBonus(0);
    }
}
