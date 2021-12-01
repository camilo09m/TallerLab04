package Model;


import java.util.Date;

public class Terremoto extends DesastreGeofisico {
    private Double magnitud;

    public Terremoto() {
        super();
        this.magnitud = (Math.round((Math.random()*10)*10d)/10d);
    }

    public Double getMagnitud() {
        return magnitud;
    }
}
