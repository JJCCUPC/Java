
package muchos.a.muchos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

public class Software {
    private String nombre;
    private int tamaño;
    private Usuario usuario;
    
    List<Usuario> usuario1=new ArrayList<Usuario>();
    
    public Software(String nombre, int tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void getUsuario(Usuario usuario) {
        Iterator <Usuario> iterador=usuario1.iterator();
        Usuario u=null;
        boolean encontrado=false;
        while(iterador.hasNext() && !encontrado){            
            u=iterador.next();
            if(u.getClave()==usuario.getClave()){
                encontrado=true;
            
            }
        
        }
        if(encontrado){
            JOptionPane.showMessageDialog(null,"Registrado con clave. \n");
             
        }else{
            usuario1.add(usuario);
            JOptionPane.showMessageDialog(null, "Usuario: "+usuario.getNombre()+"\nBienvenido a "+nombre);
        }
    }//-----
    
    
    
    
}
