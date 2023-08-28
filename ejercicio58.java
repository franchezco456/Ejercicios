import javax.swing.JOptionPane;

public class ejercicio58 {
    public static void main(String[] args) {
        double horastrabajadas=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cuantas horas trabajo"));
        double valorhora= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cuanto le pagan por hora"));
     double pago=horastrabajadas*valorhora;

     JOptionPane.showMessageDialog(null, "a usted le pagan " + pago + "$");
    }
}
