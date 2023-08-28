import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double l1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el cateto 1"));

    double l2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el cateto 2"));

    double hip=(l1*l1)+(l2*l2);

JOptionPane.showMessageDialog(null, "La hiptenusa al cuadrado es: " + hip);
  }
}