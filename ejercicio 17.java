import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double n1=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el primer numero"));

    double n2=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el segundo numero"));

    if(n1>n2){
       JOptionPane.showMessageDialog(null,"El primer numero es mayor");
    }else{
      JOptionPane.showMessageDialog(null,"El segundo numero es mayor");
    }
  }
}