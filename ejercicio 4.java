import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double r=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo"));
    double pi=(3.1416);
    double area= pi*(r*r);
    JOptionPane.showMessageDialog(null, "El area del circulo es: "+ area);
  }
}