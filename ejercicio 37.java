import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
double cobro=15;

     double horas=Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantas horas estuvo estacionado"));

    double minutos=Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantos minutos estuvo estacionado"));
    if(minutos<=10){
      double pagar=horas*cobro;
      JOptionPane.showMessageDialog(null, "Usted debe pagar " + pagar);
    }else{
      horas=horas+1;
       double pagar=horas*cobro;
      JOptionPane.showMessageDialog(null, "Usted debe pagar " + pagar);
    }
    }
  }
