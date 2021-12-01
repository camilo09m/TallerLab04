import Model.DesastreGeofisico;
import Model.Terremoto;

public class Main {
    public static void main(String[] args) {
        Terremoto terremoto = new Terremoto();
        System.out.println(terremoto.getLugar() + ", " + terremoto.getFecha() + ", " + terremoto.getMagnitud());


    }
}
