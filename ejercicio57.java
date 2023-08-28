import javax.swing.JOptionPane;

public class ejercicio57 {
    public static void main(String[] args) {
        int numero=0;
         int sumdig=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero"));
        
         
     int aux= numero;
         while(numero!=0){
           sumdig=sumdig+(numero%10);
           numero=numero/10;
         }
         JOptionPane.showMessageDialog(null, "La suma de los digitos de "+ aux + " es: "+ sumdig);
    }
}
