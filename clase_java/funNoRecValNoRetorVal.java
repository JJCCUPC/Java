package Java;

import javax.swing.JOptionPane;

public class funNoRecValNoRetorVal {
    
    void factorial(){
        int fact=1;
    int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresar un numero para su factorial: "));

    for(int cont=1; cont<=n; cont++){
        fact=fact*cont;
    }
    JOptionPane.showMessageDialog(null, fact);
    }
    public static void main(String[] args){
        funNoRecValNoRetorVal ob1;
        ob1=new funNoRecValNoRetorVal();
        ob1.factorial();
    }
}
