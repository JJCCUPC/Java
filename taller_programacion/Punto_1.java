/*
    Por Juan Jose Collazos Cortes
    Usando arreglos (arrayList) capture con JOptionPane() los atributos código,
    nombre, apellido, asignatura, nota1, nota2, nota3 de un estudiante, diga que
    promedio tiene, si gano o perdió la asignatura, esta salida la debe de hacer
    usando JTextArea(). Utilice en todos sus ejercicios métodos o funciones.
*/
package taller_programacion;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

class Estudiante_Clase {

    String CODIGO_EST;
    String NOMBRE_EST;
    String APELLIDO_EST;
    String ASIGNATURA_EST;
    double NOTA1_EST;
    double NOTA2_EST;
    double NOTA3_EST;
    double PROMEDIO_NOTAS;

    public Estudiante_Clase(String codigo_est, String nombre_est, String apellido_est, String asignatura_est, double nota1_est, double nota2_est, double nota3_est) {
        this.CODIGO_EST = codigo_est;
        this.NOMBRE_EST = nombre_est;
        this.APELLIDO_EST = apellido_est;
        this.ASIGNATURA_EST = asignatura_est;
        this.NOTA1_EST = nota1_est;
        this.NOTA2_EST = nota2_est;
        this.NOTA3_EST = nota3_est;
        this.PROMEDIO_NOTAS = (nota1_est + nota2_est + nota3_est) / 3;
    }

    public boolean Gano_o_Perdio() {
        return PROMEDIO_NOTAS >= 3.0;
    }
}

public class Punto_1 {

    static ArrayList<Estudiante_Clase> lista_estud = new ArrayList<>();

    public static void main(String[] args) {
        int opcion = 0;
        try {
            while (opcion != 3) {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "||Menu - Estudiantes|| \n\n"
                        + "1. Agregar datos \n"
                        + "2. Mostrar datos \n"
                        + "3. SALIR"));

                switch (opcion) {
                    case 1:
                        Capturar_Datos();
                        break;

                    case 2:
                        Imprimir_Datos();
                        break;

                    case 3:
                        JOptionPane.showMessageDialog(null, "El programa se cerrara. \nHasta luego!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion invalida", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            System.exit(0);
        }
    }

    public static void Capturar_Datos() {
        int op;
        op = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar los datos de un estudiante?   [1-SI] [2-NO] "));

        while (op == 1) {
            try {
                String codigo_est = JOptionPane.showInputDialog("Ingrese el codigo del estudiante:");
                if (codigo_est == null) {
                    break;
                }

                String nombre_est = JOptionPane.showInputDialog("Nombre del estudiante: ");
                String apellido_est = JOptionPane.showInputDialog("Apellido del estudiante: ");
                String asignatura_est = JOptionPane.showInputDialog("Asignatura del estudiante: ");
                double nota1_est = Double.parseDouble(JOptionPane.showInputDialog("Nota 1 del estudiante: "));
                double nota2_est = Double.parseDouble(JOptionPane.showInputDialog("Nota 2 del estudiante: "));
                double nota3_est = Double.parseDouble(JOptionPane.showInputDialog("Nota 3 del estudiante: "));

                Estudiante_Clase Obj_Estud = new Estudiante_Clase(codigo_est, nombre_est, apellido_est, asignatura_est, nota1_est, nota2_est, nota3_est);
                lista_estud.add(Obj_Estud);

                op = Integer.parseInt(JOptionPane.showInputDialog("Desea ingresar los datos de otro estudiante?   [1-SI] [2-NO] "));
                if (op != 1) {
                    JOptionPane.showMessageDialog(null, "\nCaptura de datos terminada.");

                } else {
                    JOptionPane.showMessageDialog(null, "Opcion no valida. \nCaptura de datos terminada.");
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Ingrese un valor numerico valido.");
            }

        }

    }

    public static void Imprimir_Datos() {
        JTextArea textArea = new JTextArea(70, 52);
        textArea.append("Codigo\tNombre\tApellido\tAsignatura\tPromedio\tEstado\n");
        for (Estudiante_Clase Obj_Estud : lista_estud) {
            textArea.append(Obj_Estud.CODIGO_EST + "\t" + Obj_Estud.NOMBRE_EST + "\t" + Obj_Estud.APELLIDO_EST + "\t" + Obj_Estud.ASIGNATURA_EST + "\t" + String.format("%.2f", Obj_Estud.PROMEDIO_NOTAS) + "\t" + (Obj_Estud.Gano_o_Perdio() ? "Aprobado" : "Reprobado") + "\n");
        }
        JOptionPane.showMessageDialog(null, textArea);
    }

}

