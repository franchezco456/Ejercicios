import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
  double alt= Double.parseDouble(JOptionPane.showInputDialog(null, "dijite la altura del triangulo"));

    double bas= Double.parseDouble(JOptionPane.showInputDialog(null, "dijite la base del triangulo"));

double area= (bas*alt)/2;

    JOptionPane.showMessageDialog(null, "el área del triangulo es de: "+area);
  }
}