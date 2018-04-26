package model;

/**
 *
 * @author Alex971
 */
public class PerfilTrabajador {
    private int id;
    private String miDescripcion;
    private int idUsuario;

    public PerfilTrabajador(int id, String miDescripcion, int idUsuario) {
        this.id = id;
        this.miDescripcion = miDescripcion;
        this.idUsuario = idUsuario;
    }

    public PerfilTrabajador() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMiDescripcion() {
        return miDescripcion;
    }

    public void setMiDescripcion(String miDescripcion) {
        this.miDescripcion = miDescripcion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
}
