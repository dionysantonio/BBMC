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
public class Pagamento {
    protected Jogador jogador;
    protected int pagamento;
    
    public Jogador getJogador(){
        return jogador;
    }
    
    public void setJogador(Jogador param){
        jogador = param;
    }
    
    public int getPag(){
        return pagamento;
    }
    
    public void setPag(int param){
        pagamento = param;
    }
}
