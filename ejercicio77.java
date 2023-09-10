import javax.swing.JOptionPane;

public class ejercicio77 {
    public static void main(String[] args) {
        double capital=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el capital"));
        double interesa=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tasa de interes anual"));
        double años=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el numero de años"));

        double R=(interesa/100)/12;
        double N=años*12;
        double pagar=(R*capital)/(1-(Math.pow((1/1+R),N)));
        System.out.println("Usted mensualmente debe pagar " + pagar);
    }
}
