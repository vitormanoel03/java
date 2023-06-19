
package alimentando;

import java.util.Scanner;

import classe.Retangulo;
public class retangulo {
    public static void main(String[]args){
        Scanner tc = new Scanner (System.in);
        Retangulo retangulo = new Retangulo();
        
        System.out.println("Entre com altura :");
        retangulo.altura = tc.nextDouble();
        
        System.out.println("Entre com largura :");    
        retangulo.largura = tc.nextDouble();
        
        

        
        System.out.println("O perimetro é :"+ retangulo.perimetro() );
        System.out.println("A area é :" + retangulo.area());
        System.out.println("O canto é :" + retangulo.canto());
    }
  
}
