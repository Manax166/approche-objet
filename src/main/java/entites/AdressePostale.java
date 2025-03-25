package entites;

public class AdressePostale {
    private String numeroRue;
    private String libelleRue;
    private String codePostal;
    private String ville;

    public AdressePostale(String numeroRue, String libelleRue, String codePostal, String ville) {
        this.numeroRue = numeroRue;
        this.libelleRue = libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }
}
