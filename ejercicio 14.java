import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    int salir=0;
   int numero=0;
    int sumdig=0;
    while(salir==0){ 
   numero=Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero de 4 digitos"));
    if(numero>999){
     salir=1;
    }else{ 
      salir=0;
    }   
    }
int aux= numero;
    while(numero!=0){
      sumdig=sumdig+(numero%10);
      numero=numero/10;
    }
    JOptionPane.showMessageDialog(null, "La suma de los digitos de "+ aux + " es: "+ sumdig);
  }
}