
package arrays;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Arrays {
    
    JTextArea salida;
    
    ArrayList<String> nombres;
    
    void agregar(){
        String nom=JOptionPane.showInputDialog("Ingresar un nombre: ");
        nombres.add(nom);
    
    }
    void mostrar(){
        salida=new JTextArea(20,30);
        salida.setText("Lista de Datos \n"); //Nombre de la lista.
        if(!nombres.isEmpty()){
            for(int i = 0; i < nombres.size(); i++){
                salida.append(nombres.get(i)+"\n");
            
            }
            JOptionPane.showMessageDialog(null, salida);
        
        }
        
    }
    void buscar(){
        String nomb=JOptionPane.showInputDialog("Ingrese el nombre a buscar: ");
        int indice=nombres.indexOf(nomb);
        if(indice != -1){
            JOptionPane.showMessageDialog(null, "El nombre se encuentra en la posicion: " + indice);
        }else{    
            JOptionPane.showMessageDialog(null, "El dato no se encuentra.");
        
        }
    
    
    }
    
    
    public static void main(String[] args) {
        Arrays ob=new Arrays();
        
        ob.nombres = new ArrayList<String>();
        int opcion = 0;
        double numero1, numero2;
        
        try {

            while (opcion != 7) {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Lista de numeros \n\n"
                        + "1.Agregar \n"
                        + "2.Buscar \n"
                        + "3.Modificar un elemento \n"
                        + "4.Eliminar un elemento \n"
                        + "5.Insertar un elemento \n"
                        + "6.Mostar elementos \n"
                        + "7.SALIR"));

                switch (opcion) {
                    case 1:
                        
                        ob.agregar();
                        
                        break;
                    case 2:
                        
                        ob.buscar();
                         
                        break;
                    case 3:
                        //numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        //numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                       
                        
                        break;
                    case 4:
                        numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
                        double sd;
                        //sd=ob.divi(numero1, numero2);
                        JOptionPane.showMessageDialog(null, "La división de "  );
                        
                        break;
                        
                        case 5:
                            
                        break;
                        case 6:
                            
                            ob.mostrar();
                            
                            break;
                        
                        case 7:
                            
                            System.exit(0);
                            
                            break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "usted ingreso una letra\n porfavor elija una opcion valida");
        }  
        int returnValue = 0;
    	returnValue = JOptionPane.showConfirmDialog(null, "Seguro que quieres salir?", "estas seguro?", JOptionPane.YES_NO_OPTION);
    		
    	if (returnValue == JOptionPane.YES_OPTION)
    		JOptionPane.showMessageDialog(null, "Si .");
    	else if (returnValue == JOptionPane.NO_OPTION)
    		JOptionPane.showMessageDialog(null, "No .");
    }
   
}
