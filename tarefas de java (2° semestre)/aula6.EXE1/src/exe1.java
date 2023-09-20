/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Vitor
 */
import java.util.Scanner;
public class exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int tentSenha, senha  = 2002; 
       Scanner tc = new Scanner (System.in);  
        System.out.print("DIGITE SUA SENHA");   
        tentSenha = tc.nextInt();
        
        do {
         System.out.println("senha incorreta, digite a correta!");
        tentSenha = tc.nextInt();
        }while (tentSenha != senha) ;
             
    
         System.out.print("Senha correta");
    
}
}