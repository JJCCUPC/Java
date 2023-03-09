package Java;

import javax.swing.JOptionPane;

public class funSiRecValNoRetorVal {
    int acumSuma(){
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));
        int sum=0;
    for(int cont=1; cont<=n; cont++){
        sum=sum+cont;
    }
    return sum;
    }
    public static void main(String[] args){
        funSiRecValNoRetorVal ob=new funSiRecValNoRetorVal();
        JOptionPane.showMessageDialog(null, ob.acumSuma());
    }
}
