package clase_no_3;

import java.io.IOException;
import java.util.Scanner;


public class Operacion_Cuadratica {

    public static void main(String[] args) throws IOException {
        
        Scanner lea=new Scanner(System.in);
            double x, x1, x2, a, b, c;
            
        try {
            
            System.out.println("ingrese un numero:  ");
            a=Integer.parseInt(lea.nextLine());
            System.out.println("ingrese un numero:  ");
            b=Integer.parseInt(lea.nextLine());
            System.out.println("ingrese un numero:  ");
            c=Integer.parseInt(lea.nextLine());
            
            Math.sqrt(2);
            x=(-(b)*(a));
            //termina esta cotopla eaeaeaeaeaeae B)        
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        }
    }
    
}

/*
Public static void...
    String nom;
    try{
        nom = JOptionPane.shiwInputDialog("Ingresar el nombre: ");
        JOptionPane.showMessageDialog(null, nom);
    } catch(NumberFormatException e){
        System.out.println(e);
    }
*/