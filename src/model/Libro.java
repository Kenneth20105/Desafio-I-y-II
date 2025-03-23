package model;

public class Libro extends Material {
    private String autor;
    private int numeroPaginas;
    private String editorial;
    private String isbn;
    private int anioPublicacion;

    public Libro(String codigoIdentificacion, String titulo, int unidadesDisponibles, String autor, int numeroPaginas, String editorial, String isbn, int anioPublicacion) {
        super(codigoIdentificacion, titulo, unidadesDisponibles);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.editorial = editorial;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    // Getters y Setters
    public String getAutor() { return autor; }
    public int getNumeroPaginas() { return numeroPaginas; }
    public String getEditorial() { return editorial; }
    public String getIsbn() { return isbn; }
    public int getAnioPublicacion() { return anioPublicacion; }
