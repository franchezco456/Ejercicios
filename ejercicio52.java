import javax.swing.JOptionPane;

public class ejercicio52 {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero"));
        int por;
        for(int i=0;i<=10;i++){
            por=num*i;
            System.out.println(num + "*" + i + "=" + por);
        }
    }
}
