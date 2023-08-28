import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double num=0;
    double cum=0;
    for(int i=1;i<4;i++){ 
    cum=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero "+ "#"+i));
      num=(cum+num);
    }
    double media= num/3;
     JOptionPane.showMessageDialog(null, "La media aritmetica es "+ media);
    
  }
}