import javax.swing.JOptionPane;

public class ejercicio55 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
       int div=0;
        for(int i=1;i<=num;i++){
         int rest=num%i;
         if(rest==0){
            div=div+1;
         }
        }
        if(div==2){
            JOptionPane.showMessageDialog(null, "1");
        }else{
            JOptionPane.showMessageDialog(null, "0");
        }
    }
}
