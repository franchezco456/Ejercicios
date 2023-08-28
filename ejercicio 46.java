import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double millas=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese cuantas millas marinas desea pasar a metros"));

    double metros=millas*1852;

          JOptionPane.showMessageDialog(null, millas + " millas marinas en metros es igual a " + metros);
  }
}