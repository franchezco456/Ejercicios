import javax.swing.JOptionPane;

/**
 * ejercicio51
 */
public class ejercicio51 {
public static void main(String[] args) {
    double base= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo"));
    double altura= Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo"));
    
    double area= base*altura;

    double perimetro= (base*2)+(altura*2);

    JOptionPane.showMessageDialog(null, "El area del rectagulo es: " + area + "\nEl perimetro del rectangulo es: " + perimetro);
}
    
}
