import javax.swing.JOptionPane;

public class ejercicio64 {
    public static void main(String[] args) {
        int base=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la base"));
        int exp=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el exponente"));
        int aux=base;
        for(int i=1;i<exp;i++){
       base=base*aux;
        }
        JOptionPane.showMessageDialog(null,  aux + " Elevado a la " + exp + " es igual a " + base);
    }
}
