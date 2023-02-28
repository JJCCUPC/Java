package clase_no_3;

import java.io.IOException;
import java.util.Scanner;


public class Clase_No_3_Parte_2 {

    public static void main(String[] args) throws IOException {
        
        Scanner lea=new Scanner(System.in);
            int a, b, c, sum, mul, res;
            float div, di, mod;
            boolean k;
            
        try {
            System.out.println("ingrese un numero:  ");
            a=Integer.parseInt(lea.nextLine());
            System.out.println("ingrese un numero:  ");
            b=Integer.parseInt(lea.nextLine());
            System.out.println("ingrese un numero:  ");
            c=Integer.parseInt(lea.nextLine());
            
            sum = a+b+c;
            mul = a*b*c;
            res = (a-b)-c;
            div = (a/b)/c;
            System.out.println("Suma: "+ sum +"\n"+"Resta: "+ res +"\n");
            System.out.println("Multiplicacion: "+ mul + "\n"+ "Division: "+ div +"\n");
            
            di=(a/b);
            mod=a%b;
            k=a>=b && 2<=2; /*  && (and) || (or) ! (not) */
            System.out.println("Valor de la division(La parte entera):  "+di);
            System.out.println("Valor de la division(El residuo):  "+mod);
            System.out.println("Estado de K: "+k);
            
            a+=1;
            System.out.println("Valor de a: "+a);        
                    
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e);
        }
    }
    
}