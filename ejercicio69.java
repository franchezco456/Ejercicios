import javax.swing.JOptionPane;

public class ejercicio69 {
    public static void main(String[] args) {
          int it=Integer.parseInt(  JOptionPane.showInputDialog(null, "Cuantas iteraciones desea hacer"));
   int acum=0;
   int j=21;
    for(int i=0;i<it;i++){
     acum=acum+j;
     j=j+1;
    }
    JOptionPane.showMessageDialog(null, "Al realizar " + it+ " iteraciones \ncomenzando desde 21 la sumatoria es igual " + acum);
    }
}
