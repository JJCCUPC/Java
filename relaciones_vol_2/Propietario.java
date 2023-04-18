
package relaciones_vol_2;

public class Propietario {
    private String Cedula;
    private String apellido;
    private String nombre;

    public Propietario() {
    }

    public Propietario(String Cedula, String apellido, String nombre) {
        this.Cedula = Cedula;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    @Override
    public String toString() {
        return "Cedula: " + Cedula + "\nApellido: " + apellido + "\nNombre: " + nombre;
    }
   
   
}
