
package intro_constructores;

//Tema - Array list

import java.util.List;
import java.util.ArrayList;


public class Intro_Constructores {

    public static void main(String[] args) {
        List<String> nombre=new ArrayList<>();
        ArrayList edad=new ArrayList();
        nombre.add("Pedro");
        nombre.add("Maria");
        nombre.add("Tangi");
        nombre.add("Joseph");
        nombre.add("Carl");
        edad.add(20);
        edad.add(25);
        edad.add(16);
        edad.add(13);
        edad.add(67814);
        System.out.println(" Nombres" + nombre + "\n");
        System.out.println(" Nombres" + edad + "\n");
        
        
        int tamaño = nombre.size();
        System.out.println(" -- " + tamaño + " -- ");
    }

}
