import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double number=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero que desea elevar a su enesima potencia")); 
double pot=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la potencia deseada"));

     double  elevado=Math.pow(number, pot);

     double  raiz=Math.sqrt(elevado);

     JOptionPane.showMessageDialog(null, number + " elevado a la " + pot + " es " + elevado + "\ny la raiz cuadrada de esta potencia es: " + raiz);
  }
}