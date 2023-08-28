import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero")); 
double n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));

double n3=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el tercer numero")); 

    double multiplicacion = n1*n2*n3;
    double suma  =n1+n2+n3;

    JOptionPane.showMessageDialog(null,"La suma de los 3 numeros ingresados es: " + suma + "\nLa multiplicacion de los 3 numeros ingresados es: " + multiplicacion);
  }
}