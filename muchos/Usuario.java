
package muchos.a.muchos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuario {
    private String nombre;
    private int clave;
    private Software software;
    
    List<Software> software1=new ArrayList<Software>();

    public Usuario(String nombre, int clave) {
        this.nombre = nombre;
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public int getClave() {
        return clave;
    }
    
    public void accesoSoftware(Software software){
        Iterator <Software> iterador=software1.iterator();
        Software s=null;
        boolean encontrado=false;
        while(iterador.hasNext() && !encontrado){            
            s=iterador.next();
            if(s.getNombre().equals(software.getNombre())){
                encontrado=true;
            
            }  
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,"Ya fue registrado.");
             
        }else{
            software1.add(software);
            software.getUsuario(this);
            JOptionPane.showMessageDialog(null, "Usuario, " + software.getNombre() + " ingreso correctamente en el PC,\nmemoria utilizada de " + software.getTamaño() + " Gigas.");
        }
    }
    
}
