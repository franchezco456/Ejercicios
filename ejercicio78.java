import javax.swing.JOptionPane;

public class ejercicio78 {
    public static void main(String[] args) {
        int monto=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el monto"));
       
        if(monto>10000){
          int descuento=(monto*20)/100;
          int pagar=monto-descuento;
          System.out.println("El total a pagar con descuento es " + pagar);
        }else{
           int descuento=(monto*10)/100;
          int pagar=monto-descuento;
          System.out.println("El total a pagar con descuento es " + pagar);
        }
    }
}
