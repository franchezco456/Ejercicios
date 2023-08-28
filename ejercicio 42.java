import javax.swing.JOptionPane;
class Main {
  public static void main(String[] args) {
    double kv=Double.parseDouble(JOptionPane.showInputDialog(null,"Cuantos kilovoltios requiere para encender el sistema de iluminacion?"));

    double v=kv*1000;

    double naranjas=v/0.05;

    double g=naranjas*6;

    double toneladas= g/1000000;

    JOptionPane.showMessageDialog(null, "Se necesitan " + naranjas + " naranjas y " + toneladas + " toneladas de estas");
  }
}