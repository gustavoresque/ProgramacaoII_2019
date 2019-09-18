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
public class Item {
    private int peso;
    private String nome;
    
    public Item(int peso, String nome){
        this.peso = peso;
        this.nome = nome;
    }
    
    public void setPeso(int novopeso){
        this.peso = novopeso;
    }
}
