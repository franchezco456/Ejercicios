import javax.swing.JOptionPane;

public class ejercicio72 {
    public static void main(String[] args) {
        double horast=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese cuantas horas trabajo"));
        double vhoras=Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la tarifa por hora"));
        if(horast>40){
            double exth=horast-40;
            double pagoext=vhoras+(vhoras*0.5);
            double pago1=40*vhoras;
            double pago2=exth*pagoext;
            double pago3=pago1+pago2;
            JOptionPane.showMessageDialog(null, "El total a pagar es " + pago3);
        }else{
            double pago=horast*vhoras;
            JOptionPane.showMessageDialog(null, "El total a pagar es " + pago);
        }
    }
}
