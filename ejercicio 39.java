import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double nacer=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el año de nacimiento"));

    double actual=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el año actual"));

    String name=JOptionPane.showInputDialog(null,"Ingrese su nombre");

    double anos=actual-nacer;

    double dias=anos*365;

    double mimir=(dias/100)*34;

    JOptionPane.showMessageDialog(null, name + " durmio " + mimir + " dias");
    
  }
}