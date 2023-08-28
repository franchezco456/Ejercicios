import javax.swing.JOptionPane;

public class ejercicio70 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        int acum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
            acum=acum+i;
            }else{
                if(i%2==0){
                    acum=acum-i;
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Al sumar los numeros impares y restar los pares\ndesde el numero 1 hasta el numero " + num + " es igual a " + acum);
    }
}
