/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import java.util.Date;

/**
 *
 * @author d119322
 */
public class Avulso extends Pagamento{
    private Date data;
       
     public Date getData(){
        return data;
    }
    
    public void setData(Date param){
        data = param;
    }
}
