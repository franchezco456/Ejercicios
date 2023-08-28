import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
double n1=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el primer numero")); 
double n2=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));

    if(n1>n2){
       JOptionPane.showMessageDialog(null, n1 + " es mayor");
    }else{
      JOptionPane.showMessageDialog(null, n2 + " es mayor");
    }
    
  }
}