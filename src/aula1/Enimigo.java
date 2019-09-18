/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Gustavo
 */
public class Enimigo extends Personagem{

    public Enimigo(String nome, int level) {
        super();
        this.forca = level*2;
        this.hp = level*20+100;
    }
    

    @Override
    public void treinar() {        
    }

    @Override
    public void ataque(Personagem p) {
        p.hp-=this.forca;
    }
    
}
