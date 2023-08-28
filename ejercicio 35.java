import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
 int horas=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas horas trabajo"));

    int pago=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuanto le pagan por hora"));

    if(horas<=40){
      int f=horas*pago;
      JOptionPane.showMessageDialog(null, "Usted gano: " + f + "$");
    }else{
      int extra= horas-40;
      int fi=40*pago;
      int lol=pago/2;
      pago=pago+lol;
      int sal= extra*pago;
      int pagado=fi+sal;
      
JOptionPane.showMessageDialog(null, "Usted gano: " + pagado + "$");
    
    }
  }
}