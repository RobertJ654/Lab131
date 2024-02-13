package archivo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.ListIterator;

public class Archivo {
    
    private String PATH = "persistencia/";    // Ubicación
    private String nombre;    // Se usa: PATH + nombre  -->  persistencia/nombre.txt
    
    public Archivo(String nombre) {
        this.nombre = nombre;
    }
    
    public void crear() throws FileNotFoundException, IOException {
        ObjectOutputStream archivo = new ObjectOutputStream(new FileOutputStream(PATH + nombre));
        archivo.close();
        System.out.println("Archivo creado correctamente!");
    }
    
    // Lista todos los objetos encontrados en el archivo
    public void listarEstructuras() throws FileNotFoundException, IOException {
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(PATH + nombre));
        try {
            while (true) {
                Object listaX = archivo.readObject();
                System.out.println(listaX);
            }
        } catch (Exception e) {
            archivo.close();
        }
    }
    
    // Lee los objetos guardados en la estructura y retorna una lista de objetos
    public LinkedList<Object> leerEstructuras() throws FileNotFoundException, IOException {
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(PATH + nombre));
        LinkedList<Object> estructura = new LinkedList<>();
        try {
            while (true)
                estructura.addLast(archivo.readObject());
        } catch (Exception e) {
            archivo.close();
            return estructura;
        }
    }
    
    // Guarda los objetos de la lista "estructura" en el archivo
    // Los objetos escritos en el anterior son reemplazados con los nuevos objetos
    public void guardarEstructuras(LinkedList<Object> estructura) throws FileNotFoundException, IOException {
        ObjectInputStream archivo = new ObjectInputStream(new FileInputStream(PATH + nombre));
        ObjectOutputStream temp = new ObjectOutputStream(new FileOutputStream(PATH + "tempFile.txt"));
        ListIterator<Object> it = estructura.listIterator();
        while (it.hasNext()) {
            Object x = it.next();
            temp.writeObject(x);
        }
        archivo.close();
        temp.close();
        // Reemplazar archivo con temp
        File fArchivo = new File(PATH + nombre);
        File fTemp = new File(PATH + "tempFile.txt");
        fArchivo.delete();
        fTemp.renameTo(fArchivo);
        System.out.println("Escritura correcta");
    }
    
}
