import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public void agregarLibro(Libro l){
        this.libros.add(l);
        System.out.println("Libro agregado exitosamente");
    }

    public void mostrarLibros(){
        for (Libro l: this.libros){
            System.out.println("---------------------");
            System.out.println("Identificador: " + l.getIsbn());
            System.out.println("Nombre del libro: " + l.getNombre());
            System.out.println("Autor: " + l.getAutor());
            System.out.println("Numero de paginas: " + l.getPaginas());
            System.out.println("---------------------");

        }
    }
}
