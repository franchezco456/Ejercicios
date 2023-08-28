import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
 double sueldo=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el valor basico de su sueldo"));

     double he=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el monto por horas extras"));

    double total= sueldo+he;

    double descuento=total*0.2;

    double fin= total-descuento;

     JOptionPane.showMessageDialog(null,"El sueldo basico del empleado es: " + sueldo + "\nEl monto por horas extras es: " + he + "\nEl descuento es de: " + descuento + "\nEl total ganado es de: " + fin);
  }
}