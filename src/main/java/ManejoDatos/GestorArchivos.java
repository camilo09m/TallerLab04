package ManejoDatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GestorArchivos {
    private String ruta;

    public GestorArchivos(String ruta) {
        this.ruta = ruta;
    }

    public ArrayList<String> leerArchivo() {
        File file = new File(this.ruta);
        ArrayList<String> arr = new ArrayList<>();
        Scanner input = null;
        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                arr.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("No hay datos disponibles");

        }
        return arr;
    }
}