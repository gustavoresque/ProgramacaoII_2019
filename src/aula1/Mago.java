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
public class Mago extends Personagem{

    public Mago(String apelido) {
        super(apelido);
    }
    
    

    @Override
    public void treinar() {
        inteligencia+= level*3;
        forca++;
        this.max_hp += level*19;
    }

    @Override
    public void ataque(Personagem p) {
        p.hp-=this.inteligencia;
    }
    
}
