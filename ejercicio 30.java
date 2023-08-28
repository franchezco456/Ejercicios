import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double km=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de km que desea saber en metros"));

    double m=km*1000;

    JOptionPane.showMessageDialog(null, km + "km son iguales a " + m + "M");
  }
}