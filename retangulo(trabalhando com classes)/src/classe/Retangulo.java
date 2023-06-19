
package classe;

public class Retangulo {
    
       public double altura;
       public double largura;
       public double area;
       public String canto;
       
       public double area(){
           return largura*altura;
       }
       public double perimetro(){
           return  altura*2 +largura*2;
       }
       public String canto(){
           return "angulo reto";
       }
       
    }
    

