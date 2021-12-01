package Model;

import java.util.ArrayList;
import java.util.Date;

import ManejoDatos.GestorArchivos;

public class DesastreGeofisico {
    private String lugar;
    private Date fecha;
    public ImpactoEconomico impactoEconomico;
    public ArrayList<PersonaAfectada> personasAfectadas = new ArrayList<>();

    public DesastreGeofisico() {
        seleccionarLugar();
        setFecha();
    }

    private void seleccionarLugar() {
        /*GestorArchivos ga = new GestorArchivos("ManejoDatos/Ciudades.txt");
        ArrayList<String> ciudades = ga.leerArchivo();
        this.lugar = ciudades.get(1);*/
        this.lugar = "Temuco";

    }


    public String getLugar() {
        return lugar;
    }

    public void setFecha() {
       this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }
}
