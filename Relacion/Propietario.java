
package Relacion;

public class Propietario {
    private String nombre;
    private String apellido;
    private String Cedula;

    public Propietario() {
        
    }

    public Propietario(String nombre, String apellido, String Cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.Cedula = Cedula;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Propietario...\n" + "Cedula: " + Cedula + ", Nombre: " + nombre + ", Apellido: " + apellido;
    }
    
    
}
