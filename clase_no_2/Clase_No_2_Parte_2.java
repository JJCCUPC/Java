package clase_no_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clase_No_2_Parte_2 {

    
    public static void main(String[] args) throws IOException {
        BufferedReader lea;
            lea=new BufferedReader(new InputStreamReader(System.in));
        String nom;
        
        //Int b, a, su;
        float b,a, su;
/*------------------------------------------------------------------------------*/        
        System.out.println("Ingrese un nombre: ");
        nom=lea.readLine();
        
        System.out.println("El nombre es: " + nom);        
        
/*------------------------------------------------------------------------------*/        
        try{
            System.out.println("Ingrese un numero: ");
            a=Float.parseFloat(lea.readLine() );
        //Integrer.parseInt
         System.out.println("Ingrese una numero: ");
         b=Float.parseFloat(lea.readLine() );
        //Integrer.parseInt
         su = a + b;        
         System.out.println("La suma de a y b es: " + su);
        }
/*------------------------------------------------------------------------------*/        
        catch(NumberFormatException e){
             System.out.println("Ingrese un numero: ");
        }
    }
}
