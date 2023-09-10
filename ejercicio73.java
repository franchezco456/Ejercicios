import javax.swing.JOptionPane;

/**
 * ejercicio73
 */
public class ejercicio73 {

    public static void main(String[] args) {
        double sueldo=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su sueldo"));
        if(sueldo<=1000){
            double pagar=sueldo-(sueldo*0.1);
            JOptionPane.showMessageDialog(null, "a usted le pagan " + pagar);
        }else{
            if(sueldo>1000 && sueldo<=2000){
                   double pagar=sueldo-(sueldo*0.05);
            JOptionPane.showMessageDialog(null, "a usted le pagan " + pagar);
            }else{
                if(sueldo>2000){
                     double pagar=sueldo-(sueldo*0.03);
            JOptionPane.showMessageDialog(null, "a usted le pagan " + pagar);
                }
            }
        }
    }
}