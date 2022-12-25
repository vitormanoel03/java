/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op.logicos;

import java.util.Scanner;

/**
 *
 * @author pc farias
 */
public class OpLogicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in) ;
        System.out.println("digite valor 1 :");
        int n1 = teclado.nextInt();
        System.out.println("digite valor 2 :");
        int n2 = teclado.nextInt();
        
        int maior = n1 > n2 ? n1 : n2;
        System.out.println("maior número é :" + maior);
    }
    
}
