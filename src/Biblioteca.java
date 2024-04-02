import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(Libro l){
        this.libros.add(l);
    }

    public void mostrarLibros(){
        if(!this.libros.isEmpty()){
            for (Libro l: this.libros){
                System.out.println("---------------------");
                System.out.println("Identificador: " + l.getIsbn());
                System.out.println("Nombre del libro: " + l.getNombre());
                System.out.println("Autor: " + l.getAutor());
                System.out.println("Numero de paginas: " + l.getPaginas());

            }
        }else {
            System.out.println("No hay libros");
        }

    }
}
