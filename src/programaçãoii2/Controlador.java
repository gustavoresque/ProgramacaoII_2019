/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaçãoii2;

import java.util.LinkedList;

/**
 *
 * @author Gustavo
 */
public class Controlador {
    
    
    private LinkedList<Pessoa> listaDePessoas;

    public Controlador() {
        this.listaDePessoas = new LinkedList<>();
    }
    
    
    
    
    public void cadastrarPessoa(Pessoa pessoa){
        //Fazer verificações
        this.listaDePessoas.add(pessoa);
    }
    
    public Pessoa[] listarPessoas(){
        return this.listaDePessoas.toArray(new Pessoa[]{});
    }
}
