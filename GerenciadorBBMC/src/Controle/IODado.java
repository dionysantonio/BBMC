/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import java.io.RandomAccessFile;
import java.io.IOException;
import Dados.Jogador;

/**
 *
 * @author d119322
 */
public class IODado {
    private RandomAccessFile arquivo;
    
    public IODado(String caminho){
        try{
        RandomAccessFile file = new RandomAccessFile(caminho, "rw");
        arquivo = file;
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    public void atualiza(long posIni){
        long i;
        long posFim;
        String aux;
        
        try{
            //le a proxima linha
            aux = lerLinha(posIni);
            posFim = arquivo.getFilePointer();
            i= posIni;
            arquivo.seek(posIni);
            while(i<posFim-1){
                arquivo.writeBytes(" ");
                i++;
            }
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    public long getTam(){
        try{
            return arquivo.length();
        }catch(IOException e){
            System.out.println(e.getCause());
            return 0;
        }
    }
    
    public long getPos(){
        try{
            return arquivo.getFilePointer();
        }catch(IOException e){
            System.out.println(e.getCause());
            return 0;
        }
    }
    
   // public void escrever(String s, int pos){
    public void escrever(String s){
        try{
            if(arquivo.length()>0)
                arquivo.seek(arquivo.length());
            arquivo.writeBytes(s);
        }catch(IOException e){
            System.out.println(e.getCause());
        }
    }
    

    public void finalizar(){
        try{
          arquivo.close();
        }catch(IOException e){
            System.out.println(e.getCause());
        }
        
    }
    
    public Jogador ler( long pos){
        
        Jogador aluno = new Jogador();
        String aux;
        String[] dado;  
            aux = lerLinha(pos);
            dado = aux.split(";");
            
            aluno.setName(dado[0]);
            aluno.setIdade(Integer.parseInt(dado[1]));
            aluno.setMensalista(dado[2].charAt(0));
            
        return aluno;
        
    }
    
    private String lerLinha(long pos){
        String aux = new String();
        byte n;
        
        try{
            arquivo.seek(pos);
            for(n = arquivo.readByte();n!='#';n = arquivo.readByte()){
                aux = aux + (char) n;
            }
            
        }catch(IOException e){
            System.out.println(pos + " "+ aux);
        }
        return aux;
    }
    
    
}
