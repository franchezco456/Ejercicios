import javax.swing.JOptionPane;

public class ejercicio66 {
    public static void main(String[] args) {
          int it=Integer.parseInt(  JOptionPane.showInputDialog(null, "Cuantas iteraciones desea hacer"));
   int acum=0;
    for(int i=1;i<=it;i++){
     acum=acum+((i*2)-1);
    }
    JOptionPane.showMessageDialog(null, "Al realizar " + it+ " iteraciones \ncomenzando desde 1 y yendo de 2 en 2 es igual a " + acum);
    }
}
