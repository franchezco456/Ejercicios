import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double n1=Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el numero 1"));

     double n2=Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el numero 2")); 

     double n3=Double.parseDouble(JOptionPane.showInputDialog(null, "dijite el numero 3"));

double media= (n1+n2+n3)/3;

double suma= n1+n2+n3;

double doble=n1*2;

double triple= n2*3;

double cuadrado= n3*n3;

    JOptionPane.showMessageDialog(null,"La media aritmetica de los 3 numeros ingresados es: " + media + "\nLa suma de los 3 numeros ingresados es: "+ suma+ "\nEl doble del primer numero es: "+ doble+ "\nEl triple del segundo numero es: " + triple + "\nEl cuadrado del tercer numero es: " + cuadrado);
  
  
  }
}