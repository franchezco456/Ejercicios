import javax.swing.JOptionPane;

public class ejercicio75 {
    public static void main(String[] args) {
        int año=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año"));
        if(año%4==0 && año%100!=0){
            System.out.println(año + " fue un año biciesto");
        }
                if(año%400==0){
               System.out.println(año + " fue un año biciesto");
                }
          
            
            if(año%100==0 && año%4==0 && año%400!=0){
              System.out.println(año + " no fue un año biciesto");
            }
               
            if(año%100!=0 && año%4!=0 && año%400!=0){
              System.out.println(año + " no fue un año biciesto");
            }
        }
    
}
