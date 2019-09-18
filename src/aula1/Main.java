/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import interfaceGrafica.JanelaPrincipal;

/**
 *
 * @author Gustavo
 */
public class Main {
    
    public static void main(String[] args) {
        Personagem p1;
        p1 = new Mago("Gustavo");
        p1.treinar();
        p1.treinar();
        
        p1.hello();
        
        Personagem p2;
        
        p2 = new Espadachim("José");
        p2.hello();
        p2.treinar();
        
        p1.ataque(p2);
        p2.ataque(p1);
        
        p1.hello();
        p2.hello();
        
        
        JanelaPrincipal jp = new JanelaPrincipal(p2);
        jp.setVisible(true);
        
        
    }
    
}
