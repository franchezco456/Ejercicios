import javax.swing.JOptionPane;

public class ejercicio59 {
    public static void main(String[] args) {
   
     int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero entre el 1 y el 10"));

         if(num>=1 && num<=10){
         int por;
        for(int i=0;i<=10;i++){
            por=num*i;
            System.out.println(num + "*" + i + "=" + por);
    }
         }else{
            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
         }
        
       
}
}
