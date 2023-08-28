import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
    
    for(int aux=numero;aux!=0;aux--){
      System.out.println(aux);
    }
  }
}