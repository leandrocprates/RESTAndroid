/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.controller;

import com.websystique.springmvc.domain.Message;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TesteController {
    
    @RequestMapping("/teste/{offset}")
    public String message(@PathVariable String offset) {

        try {
            System.out.println(offset);
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println(ex) ; 
        }
        return "OK" ; 
    }
    
    
}
