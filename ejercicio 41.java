import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
     double edad=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese su edad"));

    double meses=edad*12;

    double cabello=meses*0.5;

    JOptionPane.showMessageDialog(null, "El largo de su cabello es: " + cabello + " cm");

  
  }
}