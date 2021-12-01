package Model;

import java.util.ArrayList;
import java.util.Date;

import Model.PersonaAfectada;

public class DesastreGeofisico {
    private String lugar;
    private Date fecha;
    public ImpactoEconomico impactoEconomico;
    public ArrayList<PersonaAfectada> personasAfectadas = new ArrayList<>();
}
