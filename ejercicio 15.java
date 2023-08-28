import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    int edad =Integer.parseInt(JOptionPane.showInputDialog(null, "digite su edad"));
    if(edad>=18){
       JOptionPane.showMessageDialog(null,"Es mayor de edad");
    }else{
      JOptionPane.showMessageDialog(null,"Es menor de edad");
    }
  }
}