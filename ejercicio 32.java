/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio32;

import javax.swing.JOptionPane;

/**
 *
 * @author JERICOTH
 */
public class Ejercicio32 {

    public static void main(String[] args) {
            //Variables
        int base, altura, areaenmetros, areaencentimetros, milimetros;
        //Metros= Base*Altura (todo en metros)
        base=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la base del rectangulo en Metros"));
        altura=Integer.parseInt(JOptionPane.showInputDialog(null, "Dijite la altura del rectangulo en Metros"));
        //Metros
        areaenmetros=base*altura;
        //metros a centimetros
        areaencentimetros=(base+altura)*100;
        //Metros a Milimetros
        milimetros=(base+altura)*1000;
        JOptionPane.showMessageDialog(null, "Metros"+areaenmetros+"M"+" centimetros"+areaencentimetros+"CM"+" Milimetros"+milimetros+"Milimetros");
      
        
    }
}
