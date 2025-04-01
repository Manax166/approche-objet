package geometrie;

public class TestObjetGeometrique {
    public static void main(String[] args){
        ObjetGeometrique[] tab = {new Cercle(4), new Rectangle(3,5)};
        for(ObjetGeometrique val : tab) {
            System.out.println(val.perimetre());
            System.out.println(val.surface());
        }
    }
}
