import javax.swing.JOptionPane;

public class ejercicio68 {
    public static void main(String[] args) {
                  int it=Integer.parseInt(  JOptionPane.showInputDialog(null, "indique el primer numero"));
                  int it2=Integer.parseInt(  JOptionPane.showInputDialog(null, "indique el segundo numero"));
   int acum=1;
   int acum2=1;
    for(int i=1;i<=it;i++){
     acum=acum*i;
    }
    for(int j=1;j<=it2;j++){
        acum2=acum2*j;
    }
    int total=acum+acum2;
    JOptionPane.showMessageDialog(null, "La suma de los factoriales de los numeros ingresados es igual a " + total);
    }
}
