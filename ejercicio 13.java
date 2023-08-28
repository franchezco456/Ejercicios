import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
 double n1=Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el numero 1"));

     double n2=Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el numero 2")); 

     double n3=Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el numero 3"));

     double iUltimoDigito = n1%10;
    double iUltimoDigito2 = n2%10;
    double iUltimoDigito3 = n3%10;

    JOptionPane.showMessageDialog(null,"El ultimo digito de " + n1 + " Es: "+  iUltimoDigito +"\nEl ultimo digito de " + n2 + " Es: "+  iUltimoDigito2+ "\nEl ultimo digito de " + n3 + " Es: "+  iUltimoDigito3   );
  }
}