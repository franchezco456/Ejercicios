import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double n1=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el dividendo"));

    double n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el divisor"));

    double resto= n1%n2;

     JOptionPane.showMessageDialog(null, "El resto de la division es "+ resto);
  }
}