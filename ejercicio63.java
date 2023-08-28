import javax.swing.JOptionPane;

public class ejercicio63 {
    public static void main(String[] args) {
        int acum=0;
        boolean salir=false;
        do{ 
        int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero, digite un numero en el rango de 20-30 o el 0 para terminar"));
       
        if(num>=20 && num<=30){
        salir=true;
        }else{
            if(num==0){
            salir=true;
            }else{
                 acum=acum+num;
            }
        }
        }while(salir==false);
        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es igual a " + acum);
    }
}
