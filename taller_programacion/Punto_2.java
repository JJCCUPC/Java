/*
    Por Juan Jose Collazos Cortes
    Usando métodos, JOptionPane(), JTextArea() genere los números primos
    menores 100.

*/

package taller_programacion;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Punto_2 {

    public static void main(String[] args) {
        
        JTextArea PuntoArea=new JTextArea();
        PuntoArea.setText("Numeros Primos menores a 100."+"\n");
        
        double primo;
        double numero1, numero2;
        
        
        for(int i=0; i <= 100; i++){
            
            primo = i;
            numero1 = primo/2;
            numero2 = primo/3;
            
            if(primo ==2){
                PuntoArea.append("-- "+primo+" --" +"\n");  
            }
            if(primo ==3){
                PuntoArea.append("-- "+primo+" --" +"\n");
            }
            
            if (primo >=2){
                              
                if((numero1 % 1 != 0) && (numero2 % 1 != 0) ){
                    PuntoArea.append("-- "+primo+" --" +"\n"); 
                }
                
            }              
                
        }

        try {
            JOptionPane.showMessageDialog(null, PuntoArea);
            JOptionPane.showMessageDialog(PuntoArea, "\nFin del proceso.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        
       
        
}
    
