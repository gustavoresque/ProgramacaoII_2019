/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaçãoii2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Aluno aluno1 = new Aluno("Roberto", "00/00/0000");
        Aluno aluno2 = new Aluno("Yvan", "00/00/0000");
        Aluno aluno3 = new Aluno("Tiago", "00/00/0000");
        Aluno aluno4 = new Aluno("Brunelli", "00/00/0000");
        
        Professor prof1 = new Professor("Gustavo", "00/00/0000");
        Professor prof2 = new Professor("Bianchi", "00/00/0000");
        
        
        System.out.println("Aluno 1: "+aluno1.getNome());
        System.out.println("Aluno 2: "+aluno2.getNome());
        System.out.println("Aluno 3: "+aluno3.getNome());
        System.out.println("Aluno 4: "+aluno4.getNome());
        
        System.out.println("Prof 1: "+prof1.getNome());
        System.out.println("Prof 2: "+prof2.getNome());
        
        while(true){
            System.out.println("Aleatório: "+ Math.floor(Math.random()*4));
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
        
    }
    
}
