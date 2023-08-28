import javax.swing.JOptionPane;

public class ejercicio65 {
    public static void main(String[] args) {
    int it=Integer.parseInt(  JOptionPane.showInputDialog(null, "Cuantas iteraciones desea hacer"));
   int acum=0;
    for(int i=0;i<=it;i++){
     acum=acum+i;
    }
    JOptionPane.showMessageDialog(null, "La sumatoria de " + it+ " es igual a " + acum);
    }
}
