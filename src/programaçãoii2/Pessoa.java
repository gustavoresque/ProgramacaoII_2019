/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaçãoii2;

/**
 *
 * @author Gustavo
 */
public class Pessoa {
    private String nome;
    private String dataDeNascimento;

    public Pessoa(String nome, String dataDeNascimento) {
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public String getNome(){
        return this.nome;
    }
    
}
