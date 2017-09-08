/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Usuario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 *
 * @author lprates
 */
public class SalvarUserDao {
    
    
    public void salvarUsuario(Usuario usuario ){
        
        try{

            JdbcTemplate jdbcTemplate = ConectarBancoDados.conectar() ; 
            
            String sql = " INSERT INTO tb_user (email,token) VALUES( ?, ?) " ; 
            
            jdbcTemplate.update(sql, usuario.getEmail() , usuario.getToken() );

            System.out.println("Usuario Salvo");
            
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        
    } 
    
    
}
