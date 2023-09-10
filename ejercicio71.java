import javax.swing.JOptionPane;

/**
 * ejercicio71
 */
public class ejercicio71 {

    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int rep=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrse cuantas iteraciones desea que haga la serie fibonacci"));
           for (int i = 1; i <= rep; ++i) {
            System.out.print(n1 + ", ");

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}