/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_scope;

/**
 *
 * @author calza
 */
public class EVA1_1_SCOPE {
   public static void main(String[] args) {
      int x=100;//EXISTE DENTRO DEL BLOQUE DEL MAIN()
      for (int i = 0; i < 10; i++) {//EXISTE DENTRO DEL FOR
         System.out.println("i = " + i);
      }
      //aqui la i deja de funcionar por haber sido creado en el for, son variables temporales
      System.out.println("Valor final de la i = " + i);//YA NO EXISTE
      System.out.println("Valor final de la x = " + x);//TODAVIA EXISTE
       
   }
   public static void OtraFuncion(){
         System.out.println("Valor de x " + x);//No existe
      }
   //la X muere a partir de donde se cierra el main por donde fue creado
   //si fuera una variable local terminaria siendo un stack
   
}
