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
public class Espadachim extends Personagem{

    public Espadachim(String apelido) {
        super(apelido);
    }

    
    @Override
    public void treinar() {
        forca+=5;
        inteligencia++;
    }

    @Override
    public void ataque(Personagem p) {
        p.hp-=this.forca;
    }
    
}
