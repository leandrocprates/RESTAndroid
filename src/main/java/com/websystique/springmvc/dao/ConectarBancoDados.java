/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 *
 * @author lprates
 */
public class ConectarBancoDados {
    
    
    public static JdbcTemplate conectar(){
        
        JdbcTemplate jdbcTemplate = null ; 
        
        try{
            SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
            dataSource.setDriver(new com.mysql.jdbc.Driver());
            dataSource.setUrl("jdbc:mysql://localhost:3306/android?autoReconnect=true&useSSL=false");
            dataSource.setUsername("root");
            dataSource.setPassword("root");

            jdbcTemplate = new JdbcTemplate(dataSource);     
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        return jdbcTemplate ; 
        
    } 
    
    
}
