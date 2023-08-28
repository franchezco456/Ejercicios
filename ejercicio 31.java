import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double basemm=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la base en mm"));

    double alturamm=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la altura en mm"));

    double areamm=(basemm*alturamm)/2;
    double areacm= areamm/10;
    double aream=areacm/100;

    JOptionPane.showMessageDialog(null, "El area es mm es: " + areamm+ "\nEl area es cm es: " + areacm+ "\nEl area es m es: " + aream);

  }
}