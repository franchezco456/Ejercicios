import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
int p=Integer.parseInt(JOptionPane.showInputDialog(null,"Cuantas personas desea ingresar"));
     int [] sex = new int [p];
    int [] salario = new int [p];
   for(int i=0;i<p;i++){
    sex[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el sexo del trabajador #" + (i+1) + "\nIngrese 1 si es hombre\nIngrese 2 si es mujer"));

         salario[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el salario del trabajador #" + (i+1)));
   }
  double s=0;
    double sum=0;
double m=0;
    double h=0;
    for(int j=0;j<p;j++){
      if(salario[j]>700){
        s=(s+1);
      }
    sum=(sum+salario[j]);
    if(sex[j]==1){
      h=(h+1);
    }else{
      m=(m+1);
    }
      }
double pm=(m*100)/p;
    double ph=(h*100)/p;
    double prom=sum/p;

    JOptionPane.showMessageDialog(null, "La cantidad de personas cuyo salario es mayor a 700 es de: " + s+ "\nEl promedio de salarios es de: " + prom + "\nEl porcentaje de mujeres que trabajan en la empresa es de: "+ pm + "%\nEl porcentaje de hombres que trabajan en la empresa es de: "+ ph+"%");
  }
}