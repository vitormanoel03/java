/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe42ciclo2;

import java.util.Scanner;

/**
 *
 * @author Vitor
 */
public class Exe42Ciclo2 {

    public static void main(String[] args) {
        Scanner tc= new Scanner (System.in);
        float altura, largura, areatriangulo,arearetangulo;
        System.out.println("Entre com altura");
        altura = tc.nextFloat();
        
        System.out.println("Entre com largura");
        largura = tc.nextFloat();
        
        areatriangulo = (altura * largura)/2;
        arearetangulo = altura * largura;
        
        System.out.println("Se for um triângulo a area é "+areatriangulo+" mas se for um retângulo a area é :"+arearetangulo);
        
        
         
    }
}
