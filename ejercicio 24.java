import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
     double plg=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de pulgadas que desea pasar a cm"));

    double cm= plg*2.54;

    JOptionPane.showMessageDialog(null, plg + " plg en cm son: " + cm + "Cm");
  }
}