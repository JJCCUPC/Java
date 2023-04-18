
package relaciones_vol_2;

import java.util.List;

public class Auto {
    private String placa;
    private String marca;
    private int modelo;
    private List<Propietario> prop;

    public Auto() {
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

    public List<Propietario> getProp() {
        return prop;
    }

    public void setProp(List<Propietario> prop) {
        this.prop = prop;
    }
    
    
    
    @Override
    public String toString() {
        return "Placa: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
    
}
