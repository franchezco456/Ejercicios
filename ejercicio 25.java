import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
     double centigrados=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de grados centigrados que desea pasar a fahrenheit."));

    double f=((centigrados*9)/5)+32;

    JOptionPane.showMessageDialog(null, centigrados+ " grados centigrados en grados fahrenheit son: " + f + " fahrenheit");
  }
}