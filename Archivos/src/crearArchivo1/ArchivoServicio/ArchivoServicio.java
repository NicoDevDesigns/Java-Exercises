package crearArchivo1.ArchivoServicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true);
            escritor.append("Hola mundo soy Nico!!!");
            escritor.close();
            System.out.println("Se ha creado el archivo correctamente");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
