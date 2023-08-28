import javax.swing.JOptionPane;

public class ejercicio54 {
    public static void main(String[] args) {
        double cm=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de centimetros que desea pasar a pulgadas"));
        double pulg=cm*2.54;
        JOptionPane.showMessageDialog(null,  cm + " cm es igual a " + pulg + " pulgadas");
    }
}
