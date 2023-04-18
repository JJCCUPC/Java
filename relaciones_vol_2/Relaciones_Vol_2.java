
package relaciones_vol_2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Relaciones_Vol_2 {

    public static void main(String[] args) {
       JTextArea salida = new JTextArea(30,40);
       salida.setText("Relacion uno a muchos:\n");
       String pla, mar;
       int model;
       
       //Clase Auto
       pla=JOptionPane.showInputDialog("Ingrese la Placa del auto: ");
       mar=JOptionPane.showInputDialog("Ingrese la Marca del auto: ");
       model=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Modelo del auto:   (N. Entero)"));
       
       Auto aut=new Auto();
       aut.setPlaca(pla);
       aut.setMarca(mar);
       aut.setModelo(model);
       
       List<Propietario> prop=new ArrayList<Propietario>();
       Propietario p1=new Propietario();
       Propietario p2=new Propietario();
       
       //Propietario 1
       String ced1, ape1, nom1;
       ced1=JOptionPane.showInputDialog("Ingrese la Cedula: ");
       ape1=JOptionPane.showInputDialog("Ingrese el Apellido: ");
       nom1=JOptionPane.showInputDialog("Ingrese el Nombre: ");
       p1.setCedula(ced1);
       p1.setApellido(ape1);
       p1.setNombre(nom1);
       
       //Propietario 2
       String ced2, ape2, nom2;
       ced2=JOptionPane.showInputDialog("Ingrese la Cedula: ");
       ape2=JOptionPane.showInputDialog("Ingrese el Apellido: ");
       nom2=JOptionPane.showInputDialog("Ingrese el Nombre: ");
       p2.setCedula(ced2);
       p2.setApellido(ape2);
       p2.setNombre(nom2);
       
       prop.add(p1);
       prop.add(p2);
       aut.setProp(prop); //Donar a la clase Auto
       
       salida.append("El Auto "+ aut.toString()+"\n" +
                     "Propietarios: \n" + aut.getProp().toString()+"\n");
       JOptionPane.showMessageDialog(null, salida);
       
    }
    
}
