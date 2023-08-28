import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    String a=JOptionPane.showInputDialog(null, "Ingrese el texto");
    JOptionPane.showMessageDialog(null, "El texto ingresado es: "+ a);
  }
}