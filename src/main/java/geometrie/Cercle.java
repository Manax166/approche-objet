package geometrie;

public class Cercle implements ObjetGeometrique{
    private double rayon;
    @Override
    public double perimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public double surface() {
        return rayon*rayon*Math.PI;
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
}
