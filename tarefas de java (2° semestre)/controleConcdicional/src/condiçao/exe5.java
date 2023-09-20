/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vitor
 */
package condiçao;

import java.util.Scanner;

public class exe5 {
    
   public static void main(String[]args){
       Scanner tc = new Scanner (System.in);
       System.out.println("Entre com valor de x");
       double x = tc.nextDouble();
       
       System.out.println("Entre com valor de y");
       double y = tc.nextDouble();
       
       if (x>0&&y>0){
           System.out.println("primeiro quadrante");
           
       }
       if (x<0&&y>0){
           System.out.println("segundo  quadrante");
           
       }
       if (x<0&&y<0){
           System.out.println("terceiro quadrante");
           
       }
       if (x>0&&y<0){
           System.out.println("quarto quadrante");
           
       }
       
       
       
            
   }
}
