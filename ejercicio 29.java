import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    float x=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese un numero real"));

    float cubo= x*x*x;

    JOptionPane.showMessageDialog(null, "el cubo de " + x + " es " + cubo);
  }
}