import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero")); 
double n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));

    double suma= n1+n2;
    double resta= n1-n2;
    double multiplicacion= n1*n2;
    double division= n1/n2;
    double reciduo= n1%n2;

           JOptionPane.showMessageDialog(null,"la suma es igual a " + suma + "\nla resta es igual a " + resta +"\nla multiplicacion es igual a " + multiplicacion +"\nla division es igual a " + division +"\nel resto es igual a " + reciduo);
  }
}