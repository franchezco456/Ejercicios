import javax.swing.JOptionPane;

public class ejercicio53 {
    public static void main(String[] args) {
        double l=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la medida del lado del cuadrado"));
        double area=l*l;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area);
    }
}
