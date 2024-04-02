public class Libro {
    private long isbn;
    private String nombre;
    private String autor;
    private int paginas;

    public Libro(long isbn, String nombre, String autor, int paginas) {
        this.isbn = isbn;
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public Libro(String nombre, String autor, int paginas) {
        this.isbn = GeneradorISBN.newID();
        this.nombre = nombre;
        this.autor = autor;
        this.paginas = paginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getNombre() {
        return nombre;
    }


    public String getAutor() {
        return autor;
    }


    public int getPaginas() {
        return paginas;
    }

    public static class GeneradorISBN {
        private static long contador= 5567331L;

        // Métodos estáticos
        public static long newID() {
            contador++;
            return contador;
        }
    }

}
