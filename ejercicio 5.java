import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double D=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal mayor del rombo"));

      double d=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la diagonal menor del rombo"));

    double area= (D*d)/2;

    JOptionPane.showMessageDialog(null, "El area del rombo es: "+ area);

    
  }
}