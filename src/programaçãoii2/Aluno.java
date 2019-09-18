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
public class Aluno extends Pessoa{
    
    private Livro[] listaDeLivros;

    public Aluno(String nome, String dataDeNascimento) {
        super(nome, dataDeNascimento);
        this.listaDeLivros = new Livro[4];
    }
    
    
    
}
