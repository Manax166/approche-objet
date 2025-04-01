package fr.diginamic.combat;

public class Troll extends Monstre{
    public Troll() {
        super(0, 0, 5);
        this.setForce((int) (10+Math.random()*6));
        this.setPointsDeSante((int) (20+Math.random()*11));
    }
}
