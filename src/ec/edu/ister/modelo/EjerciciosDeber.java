/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class EjerciciosDeber {
 // Desarrollar una solucion que permita mostrar los mensajes "Feliz cumpleaños","Hoy sera un buen dia" y "Felices fiestas Patrias".
 // Utilice las constante de caracter de barra invertida "\n" y "\t" de los lenguajes de programacion para mejorar la forma como se muestra la informacion
public void Ejercicio1(){
    String msj1= " Feliz cumpleaños\n ";
    String msj2 = "Hoy será un buen dia ";
    String msj3 = "\nFelices Fiestas Patrias";
        JOptionPane.showMessageDialog(null , msj1 + " " + msj2 + " " + "\ty"  +  msj3);
}
/* Desarrollar una solucion que permita convertir y mostrar una cantidad expresada en metros a sus equivalentes en centimetros,pulgadas,
pies y yardas. Considere la siguiente informacion:
1 metro =100 cm
1 pulgada 2,54 cm
1 pie =12 pulgadas
1 yarda = 3 pies
*/
public int Ejercicio2(){
    int cantidad;
    int centimetros  ;
    float pulgadas,pie, yardas;
    cantidad= Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad expresada en metros : "));
     centimetros = cantidad*100;
     pulgadas = centimetros/(float)2.54;
     pie = pulgadas/12;
     yardas= pie/303;
     JOptionPane.showMessageDialog(null," centimetros: " + centimetros + " \npulgadas: "+ pulgadas + " \nPies:" + pie + " \nYardas:" + yardas  );
   
    return centimetros;
     }
/*Desarrollar una solucion que permita ingresar cuatro numeros. Mostrar la suma y multiplicacion de dichos numeros*/

public int Ejercicio3(){
   int suma=0;
   int multiplicacion=0;
   int numero;
for(int i=1;i<6;i++){
       numero =Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero "+i+ " :"));
       suma+=numero;
       }
    JOptionPane.showMessageDialog(null, suma);
   
    return 0;
} 
/*Desarrollar una solucion que permita leer la capacidad de un disco duro en Gigabytes. Mostrar el equivalente en Megabyte, Kilobytes y Bytes.
1 Kilobyte = 1024 Bytes
1 Megabyte = 1024 Kilobytes
1 Gigabyte  = 1024 Megabytes
*/
 public int Ejercicio4(){
        int equivalente;
        float mega,kilo,byt;
        int dato=1024;
        equivalente=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de un disco duro:"));
        mega = equivalente*dato;
        kilo= mega*dato;
        byt= kilo*dato;
        JOptionPane.showMessageDialog(null," Kilobyte: " + kilo + " \nMegabyte: "+ mega + " \nByte:" + byt);
        return 0;
        }
 /*Desarrollar una solucion que permita calcular y visualizar el perimetro y el area de un rectangulo.
 ingresar la base y la altura del rectangulo.Considerar: area=base*altura, y perimetro = 2*(base*altura)
 */
 public int Ejercicio5(){
     int base, altura;
     base=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base"));
     altura=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura"));
     int area=base*altura;
     int perimetro= 2*(base*altura);
     JOptionPane.showMessageDialog(null,"Area: " + area + "\nPerimetro: "  + perimetro);
     return 0;
 }
}