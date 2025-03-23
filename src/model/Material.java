package model;

public abstract class Material {
    protected String codigoIdentificacion;
    protected String titulo;
    protected int unidadesDisponibles;

    public Material(String codigoIdentificacion, String titulo, int unidadesDisponibles) {
        this.codigoIdentificacion = codigoIdentificacion;
        this.titulo = titulo;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    // Getters y Setters
    public String getCodigoIdentificacion() { return codigoIdentificacion; }
    public String getTitulo() { return titulo; }
    public int getUnidadesDisponibles() { return unidadesDisponibles; }
}
