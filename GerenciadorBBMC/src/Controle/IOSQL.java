/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;
import java.sql.*;
import java.lang.Exception;
import java.lang.ClassNotFoundException;
/**
 *
 * @author Administrador
 */
public class IOSQL {
     Connection con;       
  
    public void Conexao(){
      try{  
          con = null; 
          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
          con = DriverManager.getConnection("jdbc:odbc:BD-BBMC","","");  
  
          Statement stm = con.createStatement();    
     
          String SQL = "Select Nome,Idade,Mensalista from MeusCDs";  
            ResultSet rs = stm.executeQuery(SQL);  
     
          while(rs.next())  
          {  
             String tit = rs.getString("Nome");  
             int idade = rs.getInt("Idade");  
             char totalFaixas = (char) rs.getByte("Mensalista");  
  
             //System.out.println("Titulo: "+tit+" Autor: "+aut+"49:Tot. Faixas: "+totalFaixas);  
          }  
  
      }
      catch(Exception e)  
      { 
          e.printStackTrace();  
      }  
         finally  
      {  
         try   
         {  
            con.close();  
         }  
         catch(SQLException onConClose)  
         {  
             System.out.println("Houve erro no fechamento da conexão");  
             onConClose.printStackTrace();  
         }  
      }
}
}
