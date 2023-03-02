
package clase_no_2;

import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;


public class Ecuacion {
    public static void main(String[] args) {
        float a, b, c, cua, mul, resta, raiz, x1, x2;
        
        try{
            a = Float.parseFloat(JOptionPane.showInputDialog("Ingresar un numero: "));
            b = Float.parseFloat(JOptionPane.showInputDialog("Ingresar un numero: "));
            c = Float.parseFloat(JOptionPane.showInputDialog("Ingresar un numero: "));
            
            cua = b*b;
            mul = 4*a*c;
            resta = cua-mul;
            if(resta<0){
            JOptionPane.showMessageDialog(null, "Raiz Negativa!!!");
            
            }else{
               raiz = (float) sqrt(resta);
               x1=-b+raiz/2*a;
               x2=-b-raiz/2*a;

               JOptionPane.showMessageDialog(null, "x1: " + x1 +"\n" + "x2: " + x2);
                                  
            }
            
            
        } catch (NumberFormatException | ArithmeticException e){
        
        }    
    
    }
    
    
}
