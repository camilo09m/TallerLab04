import Model.DesastreGeofisico;
import Model.Terremoto;

import GUI.DetalleDesastre;

public class Main {
    public static void main(String[] args) {
        DetalleDesastre dd = new DetalleDesastre();
        Terremoto terremoto = new Terremoto();
        System.out.println(terremoto.getLugar() + ", " + terremoto.getFecha() + ", " + terremoto.getMagnitud());


    }
}
