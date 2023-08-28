import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
   double n=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese un numero")); 
 if(n>0){
   JOptionPane.showMessageDialog(null,  "1");
 }else{
   if(n<0){
     JOptionPane.showMessageDialog(null,  "-1");
   }else{
     JOptionPane.showMessageDialog(null,  "0");
   }
 }
  }
}