/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe4ciclo2;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exe4Ciclo2 {

    public static void main (String[]args){
    Scanner sc = new Scanner (System.in); 
     int anonasc, anoatual, idade ;
     
    System.out.println("Entre com ano de nascimento");
    anonasc = sc.nextInt();
     System.out.println("Entre com ano atual");
    anoatual = sc.nextInt();
    
    idade = anoatual - anonasc;
        System.out.println("Sua idade é "+idade);
    }
    
}

