
package clase_no_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Clase_No_3 {

    public static void main(String[] args) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Ingrese una línea de texto: ");
        //String linea = scanner.nextLine();
        //System.out.println("La línea ingresada fue: " + linea);
        
        
        BufferedReader lea;
        lea=new BufferedReader(new InputStreamReader(System.in));
            double r, areac;
            final double pi=3.1416;
            
        try {
            System.out.println("ingrese el radio de la circunferencia:  ");
            r=Double.parseDouble(lea.readLine());
            areac=pi*r*r;
            System.out.println("el area es:  "+areac);
            System.out.println("\n ");
            
        } catch (NumberFormatException e) {
            System.out.println(e+ "Digite solo numeros.");
        }
    }
    
}
