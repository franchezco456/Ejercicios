import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double precio=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del producto"));

    double iva= precio*0.19;

    JOptionPane.showMessageDialog(null, "El IVA del producto es "+ iva);
  }
}