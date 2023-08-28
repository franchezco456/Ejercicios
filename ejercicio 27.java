import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
int genero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su genero:\n1.masculino\n2.femenino\n3.no binario"));

    String nombre= JOptionPane.showInputDialog(null,"Ingrese su nombre");

    if(genero==1){
      JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);
    }else{
      if(genero==2){
JOptionPane.showMessageDialog(null, "Bienvenida " + nombre);
      }else{
        JOptionPane.showMessageDialog(null, "hola indeciso");
      }
    }
  }
}