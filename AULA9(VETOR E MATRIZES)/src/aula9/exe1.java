package aula9;


import java.util.Scanner;
class exe1 {
    public static void main(String args[]) {
      Scanner tc = new Scanner (System.in);
      int intneg[];  //vetor do números negativos
      int n =0;      //variavel da quantidades de entradas
              
      int numentrada []; //vetor das entradas de números
      
      System.out.println("Entre com a quantidade de entradas");
      n = tc.nextInt(); // usuário entra com a quantidade de números que desejar
      
      if(n>10){
         n = 10; // aqui o programa limita a quantidade a 10 entradas
      }
      intneg= new int [n];
      numentrada = new int [n];
      
            for (int i = 0; i < numentrada.length;i++) { // aqui o usuário entra com cada valor individualmente
                    System.out.println("Entre com valor: " );
                    numentrada[i] = tc.nextInt();
                    if (numentrada[i]<0){
                        intneg[i] = numentrada[i];   // armazenamento de números negativos
                    }
      }
            System.out.println("Números negativos :"); // aqui é exibido os números negativos
            for (int i = 0; i < intneg.length;i++){
                if(intneg[i]<0){
                System.out.println(intneg[i]);
                }
            }
    }
}
