import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
     double [] notas = new double[5];
     double [] dobles = new double[5];
    
    for(int i=0; i<5; i++){
      notas[i]=Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la nota #" + (i+1)));
    }

    double nf=notas[0]+notas[1]+notas[2]+notas[3]+notas[4];

    double media= nf/5;

    for(int j=0; j<5; j++){
      dobles[j]=notas[j]*2;
    }

    JOptionPane.showMessageDialog(null,"La suma de las 5 notas es:" + nf + "\nEl promedio de las notas es de: " + media + "\nEl doble de la nota #1 es: " + dobles[0]+ "\nEl doble de la nota #2 es: " + dobles[1]+"\nEl doble de la nota #3 es: " + dobles[2]+"\nEl doble de la nota #4 es: " + dobles[3]+"\nEl doble de la nota #5 es: " + dobles[4] );
  }
}