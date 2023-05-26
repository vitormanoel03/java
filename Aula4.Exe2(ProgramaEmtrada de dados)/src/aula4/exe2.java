/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula4;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class exe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float raio,area;
       Scanner sc = new Scanner ( System.in);
       System.out.println("entre com raio ?");
       
       raio = sc.nextFloat();
       area = (float) (Math.PI*raio);
       
        System.out.println(area);
       
    }
    
}
