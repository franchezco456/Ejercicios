import javax.swing.JOptionPane;
class Main {
public static void main(String[] args) {
    String cadena =JOptionPane.showInputDialog(null,"Ingrese la cadena de texto");
char primeraLetra = cadena.charAt(0);
      JOptionPane.showMessageDialog(null,"La primera letra es: " + primeraLetra);
  }
}