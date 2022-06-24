/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ProyectoAP.ProyectoAP.controller;

import com.ProyectoAP.ProyectoAP.model.userLogin;
import com.ProyectoAP.ProyectoAP.repository.userLoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Pc
 */
@RestController
@RequestMapping("/api/v1/")
public class userLoginCotroller {
    
     @Autowired
    private userLoginRepository userLoginRepository1;
     
     
     
     //buscar datos login>> http://localhost:8080/api/v1/loginData  //
      @GetMapping("/loginData")  
      public List<userLogin> buscarLoginData(){
          
        return userLoginRepository1.findAll();}
      
    
    
}
