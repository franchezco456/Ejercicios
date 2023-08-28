import javax.swing.JOptionPane;

public class ejercicio56 {
    public static void main(String[] args) {
        double seg=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la cantidad de segundos que desea conocer en minutos y horas"));
        double min=seg/60;
        double horas=min/60;
    
        JOptionPane.showMessageDialog(null, "Segundos: " + seg + "\nMinutos: " + min + "\nHoras: " + horas);
    }
}
