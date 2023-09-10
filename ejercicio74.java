import javax.swing.JOptionPane;

public class ejercicio74 {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
        int n3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tercer numero"));

        if(n1>n2 && n2>n3){
            System.out.println(n1+"-"+n2+"-"+n3);
        }else{
            
        if(n1>n3 && n3>n2){
            System.out.println(n1+"-"+n3+"-"+n2);
        }else{
            if(n2>n1 && n1>n3){
            System.out.println(n2+"-"+n1+"-"+n3);
        }else{
            if(n2>n3 && n3>n1){
            System.out.println(n2+"-"+n3+"-"+n1);
        }else{
            if(n3>n2 && n2>n1){
            System.out.println(n3+"-"+n2+"-"+n1);
        }else{
            if(n3>n1 && n1>n2){
            System.out.println(n3+"-"+n1+"-"+n2);
        }
    }
}
    }
}
        }
    }
}
