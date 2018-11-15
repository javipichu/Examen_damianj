/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2º_ejercicio_examen_damian;

import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezotero
 */
public class New_LoVivido {//refactorizado

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
String n;
String e;

int m;
int d;
int h;
int a;

n = JOptionPane.showInputDialog (ESCRIBA_el_NOMBRE_);//introduje un cambio de constante 
e = JOptionPane.showInputDialog (ESCRIBA_la_EDAD_);
 
a = Integer.parseInt (e);
 
m = (a*12);
d = (a*365);
h = (d*24);
 
 JOptionPane.showMessageDialog(null,  "Meses: "  +m,"Numero de meses vividos de " +n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Días: " +d,"Numero de días vividos de "+n,JOptionPane.INFORMATION_MESSAGE);


 JOptionPane.showMessageDialog(null, "Horas: " +h,"Numero de horas vividos de "+n,JOptionPane.INFORMATION_MESSAGE);

   System.exit (0);

}
    public static final String ESCRIBA_la_EDAD_ = "Escriba su edad: ";
    public static final String ESCRIBA_el_NOMBRE_ = "Escriba su nombre: ";
   

}
//tambie está FORMATEADO