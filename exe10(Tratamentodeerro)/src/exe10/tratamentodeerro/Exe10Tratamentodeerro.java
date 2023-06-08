
package exe10.tratamentodeerro;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Exe10Tratamentodeerro {

    
    public static void main(String[] args) {
        Scanner tc = new Scanner (System.in);
        int num1, num2, sair=0; int  soma = 0;
          /*
        num1 e num2 são as variaveis de entradas feitas pelo usuário.
        while permiti que o usuário caso coloque um número inválido repita a operação
        */     
       while(sair == 0){
       
        try {
        System.out.println("Entre com primeiro valor");
        num1 = tc.nextInt();
        System.out.println("Entre com segundo valor");
        num2 = tc.nextInt();
        soma = num1+num2;
        System.out.println(soma);
        
            
            sair = 1;
            
        }
        catch(InputMismatchException e){
            System.out.println("Você digitou um número com vírgula tente novamente..");
            tc.nextLine();
        }
        
        finally{
       
    
        
        }
        
    }
        
    }
    
}
