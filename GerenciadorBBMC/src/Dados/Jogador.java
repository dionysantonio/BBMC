/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author d119322
 */
public class Jogador {
    private String nome;
    private int idade;
    private char mensalista;
    
    public String getName(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int param){
        idade = param;
    }
    
    public void setName(String param){
        nome = param;
    }
    
    public char getMensalista(){
        return mensalista;
    }
    
    public void setMensalista(){
        
    }
}
