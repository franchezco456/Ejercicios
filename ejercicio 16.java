import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
double nota =Double.parseDouble(JOptionPane.showInputDialog(null, "digite su nota"));
     if(nota>=3){
       JOptionPane.showMessageDialog(null,"Gano");
    }else{
      JOptionPane.showMessageDialog(null,"Perdio");
    }
  }
}