import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean bucle = true;

        Biblioteca biblio = new Biblioteca();
        biblio.agregarLibro(new Libro(5567331, "Don Quijote", "Miguel de Cervantes", 300));
        biblio.agregarLibro(new Libro("Cien años de soledad" ,"Gabriel Garcia Marquez", 450));
        biblio.agregarLibro(new Libro("Dorian Gray" ,"Oscar Wilde", 450));
        biblio.agregarLibro(new Libro("Odisea" ,"Homero", 500));
        biblio.mostrarLibros();
    }
}
