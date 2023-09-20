/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula10exe2;

import java.lang.ArithmeticException;
import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Aula10exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int num1, num2, sair=0; int   divisão = 0;
          /*
        num1 e num2 são as variaveis de entradas feitas pelo usuário.
        while permiti que o usuário caso coloque um número inválido repita a operação
        */     
       while(sair == 0){
       
        try {
        System.out.println("Entre com primeiro valor");
        num1 = tc.nextInt ();
        System.out.println("Entre com segundo valor");
        num2 = tc.nextInt();
        divisão = num1/num2;
        System.out.println(divisão);
        
            
            sair = 1;
            
        }
        catch(java.lang.ArithmeticException e){
            System.out.println("Você digitou 0 no segundo valor. Não existe na matemática divisão por zero");
            tc.nextLine();
        }
        
        finally{
       
    
        
        }
        
    }
        
    }
    
}

