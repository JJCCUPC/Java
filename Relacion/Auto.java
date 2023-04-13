
package Relacion;

public class Auto {
    private String placa;
    private String marca;
    private int modelo;
    private Propietario prop;
    
    public Auto(String ctC462, String honda, int par){
    
    }

    public Auto(String placa, String marca, int modelo, Propietario prop) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Propietario getProp() {
        return prop;
    }

    public void setProp(Propietario prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Auto...\n" + "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", \nPropietario: \n" + prop;
        
    }
    
    
}
