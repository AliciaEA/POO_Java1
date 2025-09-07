package org.example.modelo;

public class Carrera
{
    private Integer id;
    private String nombre;
    private String descripcion;
    private String nombreCoordinador;
    private String facultad;

    public Carrera()
    {
    }

    public Carrera(Integer id, String nombre, String descripcion, String nombreCoordinador, String facultad)
    {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nombreCoordinador = nombreCoordinador;
        this.facultad = facultad;
    }

    public String getFacultad()
    {
        return facultad;
    }

    public void setFacultad(String facultad)
    {
        this.facultad = facultad;
    }

    public String getNombreCoordinador()
    {
        return nombreCoordinador;
    }

    public void setNombreCoordinador(String nombreCoordinador)
    {
        this.nombreCoordinador = nombreCoordinador;
    }

    public String getDescripcion()
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "Carrera{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nombreCoordinador='" + nombreCoordinador + '\'' +
                ", facultad='" + facultad + '\'' +
                '}';
    }
}
