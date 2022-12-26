/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.data;

/**
 *
 * @author pc farias
 */
public class ProgramaData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 String mes [] = {"jan","fev","marc","abr","mai","junh","jul","agos","set","out","nov","dez",}; 
    String lot []= {"31","28","31","30","31","30","31","31","30","31","30","31",};
    
    for(int c=0;c<=11;c++){
        System.out.println(mes[c]+"  tem  "+lot[c]+"  dias");
        
    }
    }
    
    
}
