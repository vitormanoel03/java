/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Vitor
 */
package entradaesaidadedado;
import javax.swing.JOptionPane;
public class exe4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
       String fun_quant   = JOptionPane.showInputDialog("Coloque o nunero de funcionário");
         String hora_quant  = JOptionPane.showInputDialog("Coloque a quantidade de hora ");
           String cash_hora  = JOptionPane.showInputDialog("Coloque o valor de cada hora");
           
      
       int fun_quant1 = Integer.parseInt(fun_quant);
        double hora_quant1 = Double.parseDouble(hora_quant);
        double cash_hora1 = Integer.parseInt(cash_hora);
     
        
        double salario = hora_quant1 * cash_hora1 ;
        
       
       
      JOptionPane.showMessageDialog(null,"Numero "+fun_quant1+" salario "+salario);
    }
    
}
