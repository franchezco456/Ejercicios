import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double numero=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero real"));

    double entero= Math.floor(numero);
    double decimal= numero-entero;

     JOptionPane.showMessageDialog(null, "La parte entera es: " + entero + "\nLa parte decimal es: " + decimal);

    
  }
}