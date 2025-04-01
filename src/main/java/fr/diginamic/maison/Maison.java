package fr.diginamic.maison;

public class Maison {
    Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece){
        if(piece == null || piece.getSuperficie()<=0) return;
        Piece[] temp = new Piece[pieces.length];
        System.arraycopy(pieces, 0, temp, 0, pieces.length);
        pieces = new Piece[temp.length+1];
        System.arraycopy(temp, 0, pieces, 0, temp.length);
    }
    public double afficherSuperficieTotale(){
        double total = 0;
        for(Piece piece : pieces){
            total += piece.getSuperficie();
        }
        return total;
    }
    public double afficherSuperficieEtage(int etage){
        double total = 0;
        for(Piece piece : pieces){
            if(piece.getEtage() == etage) total += piece.getSuperficie();
        }
        return total;
    }
    public double affivcherSuperficieTypeDePiece(Piece p) {
        double total = 0;
        for (Piece piece : pieces) {
            if(piece.equals(p)) total += piece.getSuperficie();
        }
        return total;
    }
    public int affciherCompteTypeDePiece(Piece p){
        int count = 0;
        for (Piece piece : pieces) {
            if(piece.equals(p)) count++;
        }
        return count;
    }
}
