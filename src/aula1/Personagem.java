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
public abstract class Personagem {
    
    private String apelido;
    protected int hp;
    protected int forca;
    protected int inteligencia;

    /**
     * Classe utilizada para definição das propriedades e metodos de personagens do jogo.
     * @param apelido Será utilizado como o identificador do personagem no jogo.
     */
    public Personagem(String apelido) {
        this.apelido = apelido;
        this.hp = 100;
        this.forca = 10;
    }
    public Personagem() {
        this("Sem nome");
    }
    
    /**
     *  
     * Este método é usado para aprimorar as habilidades do personagem.
     * Geralmente esse método deve ser chamado após o termino de uma batalha.
     * 
     */
    public abstract void treinar();
    public abstract void ataque(Personagem p);
    
    
    public void hello(){
        System.out.println("Olá eu sou "+this.apelido);
        System.out.println("Tenho "+this.hp+" pontos de HP");
        System.out.println("E "+this.forca+" de força.");
        System.out.println("----------------------------------\n\n");
    }
    
    public String getApelido() {
        return apelido;
    }

    public int getHp() {
        return hp;
    }

    public int getForca() {
        return forca;
    }

    public int getInteligencia() {
        return inteligencia;
    }
    
}
