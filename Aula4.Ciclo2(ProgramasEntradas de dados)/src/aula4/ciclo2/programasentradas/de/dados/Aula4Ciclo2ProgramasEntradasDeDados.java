/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4.ciclo2.programasentradas.de.dados;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Aula4Ciclo2ProgramasEntradasDeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, soma ;
       Scanner tc= new Scanner (System.in);
         
       
        
        System.out.println("entre com primeiro valor :");
        num1 = tc.nextInt();
   
        System.out.println("entre com segundo valor :");
        num2 = tc.nextInt();
        
        soma = num1 + num2;
        
        System.out.println(soma);
    }
    
}
