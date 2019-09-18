/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGrafica;

import aula1.Enimigo;
import aula1.Personagem;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class ThreadDeBatalha extends Thread{

    private int cont = 0;
    private Personagem personagem;
    private BattleActionListener listener;

    public ThreadDeBatalha(Personagem personagem) {
        this.personagem = personagem;
        this.listener = new BattleActionListener() {

            @Override
            public void battleEnd() {
                
            }

            @Override
            public void roundEnd(Personagem p, Personagem en) {
                
            }
        };
    }
    
    
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            }
            Enimigo en = new Enimigo("Dragão", 1);
            while(en.getHp() > 0 && personagem.getHp() > 0){
                en.ataque(personagem);
                personagem.ataque(en);
                listener.roundEnd(personagem, en);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }
            }
            if(personagem.getHp() > 0){
                this.personagem.treinar();
            }
            personagem.restaurarHP();
            
            System.out.println("Thread Batalha: "+(cont++));
            listener.battleEnd();
        }
    }

    public void setListener(BattleActionListener listener) {
        this.listener = listener;
    }
    
    
    
    
    public static interface BattleActionListener {
        public void battleEnd();
        public void roundEnd(Personagem p, Personagem en);
    }
    
}
