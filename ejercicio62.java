import javax.swing.JOptionPane;

public class ejercicio62 {
    public static void main(String[] args) {
        double temp[]=new double[6];
        double acum=0;
        double mayor=0;
        double menor=0;
        for(int i=0;i<6;i++){
            temp[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "registre la temperatura #"+ (i+1)));
            acum=acum+temp[i];
            if(temp[i]>mayor){
                mayor=temp[i];
            }
            if(temp[i]<menor){
                menor=temp[i];
            }
        }
        double media=acum/6;

        JOptionPane.showMessageDialog(null, "La temperatura maxima es: " + mayor + "\nLa temperatura media es : " + media + "\nLa temperatura minima es: " + menor );
        

    }
}
