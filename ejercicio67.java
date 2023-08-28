import javax.swing.JOptionPane;

public class ejercicio67 {
    public static void main(String[] args) {
          int it=Integer.parseInt(  JOptionPane.showInputDialog(null, "Indique el numero el cual desea saber su factorial"));
   int acum=1;
    for(int i=1;i<=it;i++){
     acum=acum*i;
    }
    JOptionPane.showMessageDialog(null, "el factorial de " + it+ " es igual a " + acum);
    }
}
