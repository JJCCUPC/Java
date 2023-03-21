/*
    Por Juan Jose Collazos Cortes
    Usando métodos, JOptionPane(), JTextArea() genere los números
    perfectos menores a 1000. (Math.pow(base, exponente))

*/

package taller_programacion;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Punto_3 {

    public static void main(String[] args) {
        
        JTextArea PuntoArea=new JTextArea();
        PuntoArea.setText("Numeros Perfectos menores a 1000."+"\n");
        
        double primo, aux, cont, perfecto;
        double numero1, numero2;
        aux = 0;
        cont = 1;
        
        while(aux <= 1000){
            
            primo = (Math.pow(2,cont)) - 1;
            numero1 = primo/2;
            numero2 = primo/3;                   
            
            if (primo == 3){
                perfecto = (Math.pow(2,cont-1))*primo;
                aux = perfecto;
                PuntoArea.append("-- "+perfecto+" --" +"\n"); 
            }
            
            if (primo >=2){
                              
                if((numero1 % 1 != 0) && (numero2 % 1 != 0) ){
                    perfecto = (Math.pow(2,cont-1))*primo;
                    aux = perfecto;
                    
                    if(aux < 1000){
                        PuntoArea.append("-- "+perfecto+" --" +"\n");
                    }
                }
                
            }                 
            
            cont = cont + 1;
        }

        try {
            JOptionPane.showMessageDialog(null, PuntoArea);
            JOptionPane.showMessageDialog(PuntoArea, "\nFin del proceso.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
        
       
        
}
    
