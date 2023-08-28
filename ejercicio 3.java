import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double base=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo"));
    double altura=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo"));

    double area=(base*altura)/2;

    JOptionPane.showMessageDialog(null, "El area del triangulo es: "+ area);
    
  }
}