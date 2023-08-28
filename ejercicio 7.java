import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double num=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero"));
    if(num>=0){
      JOptionPane.showMessageDialog(null, "El numero es positivo");
    }else{
      JOptionPane.showMessageDialog(null, "El numero es negativo");
    }
  }
}