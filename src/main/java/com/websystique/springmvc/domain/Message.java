/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.domain;

/**
 *
 * @author lprates
 */

public class Message {
 
    String name;
    String text;
 
    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }
 
    public String getName() {
        return name;
    }
 
    public String getText() {
        return text;
    }
 
}