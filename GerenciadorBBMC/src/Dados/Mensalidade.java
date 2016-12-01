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
public class Mensalidade {
    private Jogador jogador;
    private String mes;
    private int ano;
    private char pago;
    
    public Jogador getJogador(){
        return jogador;
    }
    
    public void setJogador(Jogador param){
        jogador = param;
    }
    
    public String getMes(){
        return mes;
    }
    
    public void setMes(String param){
        mes = param;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setAno(int param){
        ano = param;
    }
    
    public char getPago(){
        return pago;
    }
    
    public void setJogador(char param){
        pago = param;
    }
}
