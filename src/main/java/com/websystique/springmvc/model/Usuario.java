/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.model;

import lombok.Data;

/**
 *
 * @author lprates
 */
@Data
public class Usuario {
    private int id;
    private String token;
    private String email;
    private String mensagem;
}
