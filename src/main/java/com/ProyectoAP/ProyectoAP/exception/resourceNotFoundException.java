/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoAP.ProyectoAP.exception;

import org.springframework.http.HttpStatus;/**/
import org.springframework.web.bind.annotation.ResponseStatus;/**/

/**
 *
 * @author Pc
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class resourceNotFoundException  extends RuntimeException{
    
    private static final long serialVersionUID = 1L;
    public  resourceNotFoundException (String message){
        super(message);
    }
    
    
 
    
    
    
    
}
