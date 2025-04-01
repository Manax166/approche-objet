package pays;

public class TestPays {
    public static void main(String[] args){
        Pays p1 = new Pays("Fronce", 66);
        Pays p2 = new Pays("Fronce", 66);
        System.out.println("p1 equals p2 : " + p1.equals(p2));
        p2.setPopulation(77);
        System.out.println("p1 equals p2 : " + p1.equals(p2));
    }
}
