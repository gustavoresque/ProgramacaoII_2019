/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1;

/**
 *
 * @author Gustavo
 */
public class Exercicios {
    
    
    
    public static void modificaValor(int valor, int novoValor){
        valor = novoValor;
    }
    
    public static void main(String[] args) {
        int[] meuValor = new int[]{2};
        int meuValorPrimitivo = 2;
        System.out.println("Meu Valor é: "+meuValorPrimitivo);
        modificaValor(meuValorPrimitivo, 10);
        System.out.println("Meu Valor é: "+meuValorPrimitivo);
    }
    
}
