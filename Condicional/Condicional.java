package clase_no_2;

import javax.swing.JOptionPane;

public class Condicional {
    public static void main(String[] args){
        
        float n1, n2, n3, prom;
        
        try{
            n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota No. 1: "));
            n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota No. 2: "));
            n3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese Nota No. 3: "));
            prom = (float)(n1*0.3+n2*0.3+n3*0.4);


            if (prom>=1 && prom<=3.9){
                JOptionPane.showMessageDialog(null, "Nojoda, cule pelao bobo ve! (regular)");       

            }else{
                if(prom>=3 && prom<=5){
                    JOptionPane.showMessageDialog(null, "Inteligente y todo, pero te falta calle pa! (Excelente)");     
                }    
            }
        }catch(Exception e){
            JOptionPane.showInternalMessageDialog(null, "Que meta numero GONORREA!!!");
        }
    
    
    }
    
}
