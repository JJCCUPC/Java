
package clase_java;

import javax.swing.JOptionPane;

public class menu {

    void sumar() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
        double suma = numero1 + numero2;
        JOptionPane.showMessageDialog(null, "La suma de " + numero1 + " y " + numero2 + " es: " + suma);
    }

    void restar() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
        double resta = numero1 - numero2;
        JOptionPane.showMessageDialog(null, "La resta de " + numero1 + " y " + numero2 + " es: " + resta);
    }

    void multiplicar() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
        double multiplicacion = numero1 * numero2;
        JOptionPane.showMessageDialog(null, "La multiplicación de " + numero1 + " y " + numero2 + " es: " + multiplicacion);
    }

    void dividir() {
        double numero1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer número: "));
        double numero2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo número: "));
        if (numero2 == 0) {
            JOptionPane.showMessageDialog(null, "Error: no se puede dividir entre cero");
        } else {
            double division = numero1 / numero2;
            JOptionPane.showMessageDialog(null, "La división de " + numero1 + " y " + numero2 + " es: " + division);
        }
    }

    public static void main(String[] args) {
        int opcion = 0;
        menu ob = new menu();
        try {
            while (opcion != 5) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "QUE QUIERE HACER?\n\n"
                        + "1.SUMA \n"
                        + "2.RESTA \n"
                        + "3.MULTIPLICACION \n"
                        + "4.DIVISION \n"
                        + "5.SALIR"));

                switch (opcion) {
                    case 1:
                        ob.sumar();
                        break;
                    case 2:
                        ob.restar();
                        break;
                    case 3:
                        ob.multiplicar();
                        break;
                    case 4:
                        ob.dividir();
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "usted ingreso una letra\n porfavor elija una opcion valida");
        }
    }
}