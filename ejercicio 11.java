import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double la= Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el lado a del rectangulo"));

    double lb= Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el lado b del rectangulo"));

    double area= la*lb;

    JOptionPane.showMessageDialog(null, "el área del rectangulo es de: "+area);
  }
}