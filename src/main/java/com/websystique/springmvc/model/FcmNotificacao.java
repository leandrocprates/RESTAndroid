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
public class FcmNotificacao {
    private Notification notification = new Notification();
    private String to;
    
}
