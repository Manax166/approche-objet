package fr.diginamic.maison;

public class Piece {
    private double superficie;
    private int etage;
    private String type;

    public Piece(double superficie, int etage, String type) {
        this.superficie = superficie;
        this.etage = etage;
        this.type = type;
    }
    public int getEtage(){
        return etage;
    }
    public double getSuperficie() {
        return superficie;
    }
    public String getType() {
        return type;
    }
    public boolean equals(Piece piece){
        return this.type.equals(piece.getType());
    }
}
