
package Relacion;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class RelacionMain {

    public static void main(String[] args) {
        JTextArea salida=new JTextArea(30,40);
        salida.setText("Relacion uno a uno \n");
        String ced, ape, nom, pla, mar;
        int model;
        ced=JOptionPane.showInputDialog("Ingrese la cedula: ");
        ape=JOptionPane.showInputDialog("Ingrese el apellido: ");
        nom=JOptionPane.showInputDialog("Ingrese el nombre: ");
        //Clase Auto
        pla=JOptionPane.showInputDialog("Ingrese la placa del auto: ");
        mar=JOptionPane.showInputDialog("Ingrese la marca del auto: ");
        model=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del auto: "));
        
        Propietario p = new Propietario();
        p.setCedula(ced);
        p.setApellido(ape);
        p.setNombre(nom);
        
        Auto a = new Auto(pla,mar,model);
        a.setProp(p);
        salida.append(a.toString());
        JOptionPane.showMessageDialog(null, salida);
        
    }
    
}
