public class Libro {
    private int isbn;
    private String nombre;
    private String autor;
    private int paginas;

    public Libro(int isbn, String nombre, String autor, int paginas) {
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public static class GeneradorISBN {
        private static int contador= 0;

        // Métodos estáticos
        public static int newID() {
            contador++;
            return contador;
        }
    }

}
