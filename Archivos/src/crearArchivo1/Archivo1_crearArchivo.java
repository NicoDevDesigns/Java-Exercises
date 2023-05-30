package crearArchivo1;

import ar.nico.archivos.crearArchivo1.ArchivoServicio.ArchivoServicio;

public class Archivo1_crearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "C:\\Users\\sanch\\Desktop\\Curso Java\\nico.txt";
        ArchivoServicio service = new ArchivoServicio();
        service.crearArchivo(nombreArchivo);
    }
}
