import javax.swing.JOptionPane;

public class ejercicio60 {
    public static void main(String[] args) {
        int val;
        boolean salir=false;
        int count=0;
        do {
            val=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero")); 
            if(val==0){
                salir=true;
            }else{
                if(val>0){
                    count=count+1;
                }
            }
        } while (salir==false);
       JOptionPane.showMessageDialog(null, "La cantidad de numeros mayores a 0 es: " + count);
    }
}
