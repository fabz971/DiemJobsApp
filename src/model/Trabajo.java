package model;

import java.sql.Date;

/**
 *
 * @author Alex971
 */
public class Trabajo {
    private int id;
    private String descripcion;
    private int duracion;
    private Date fecha;
    private boolean estado;
    private int idEmpleador;
    private int idTrabajador;

    public Trabajo() {
    }

    public Trabajo(int id, String descripcion, int duracion, Date fecha, boolean estado, int idEmpleador, int idTrabajador) {
        this.id = id;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.fecha = fecha;
        this.estado = estado;
        this.idEmpleador = idEmpleador;
        this.idTrabajador = idTrabajador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getIdEmpleador() {
        return idEmpleador;
    }

    public void setIdEmpleador(int idEmpleador) {
        this.idEmpleador = idEmpleador;
    }

    public int getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(int idTrabajador) {
        this.idTrabajador = idTrabajador;
    }
    
}
