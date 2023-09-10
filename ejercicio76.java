import javax.swing.JOptionPane;

public class ejercicio76 {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        int acum=0;
        do {
            n=n/10;
        acum=acum+1;
        } while (n!=0);
        JOptionPane.showMessageDialog(null, "El numero ingresado tiene " + acum + " cifras");
    }
}
