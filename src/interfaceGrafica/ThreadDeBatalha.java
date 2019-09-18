/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceGrafica;

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
        this.listener = () -> {
        };
    }
    
    
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }
            this.personagem.treinar();
            System.out.println("Thread Batalha: "+(cont++));
            listener.battleEnd();
        }
    }

    public void setListener(BattleActionListener listener) {
        this.listener = listener;
    }
    
    
    
    
    public static interface BattleActionListener {
        public void battleEnd();
    }
    
}
