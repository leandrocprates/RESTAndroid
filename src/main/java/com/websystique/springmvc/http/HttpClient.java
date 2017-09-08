/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.websystique.springmvc.http;

import com.google.gson.Gson;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.websystique.springmvc.model.FcmData;
import com.websystique.springmvc.model.FcmNotificacao;
import com.websystique.springmvc.model.Usuario;

/**
 *
 * @author lprates
 */
public class HttpClient {
    
    
    public static enum Tipo {NOTIFICACAO , MENSAGEM }
    
    public void criarRequisicao(Usuario usuario ,  Tipo tipo ){
        
        try{
            OkHttpClient client = new OkHttpClient();

            Request.Builder  requestBuilder = new Request.Builder();
            requestBuilder.url("https://fcm.googleapis.com/fcm/send"); 
            
            requestBuilder.addHeader("Authorization", "key=AAAAGYw4hd8:APA91bG_vtOqwjhgXCbtwLltqUJuWSIF_H4ScHybfNhWoJ5JNxEnLKogPwyzfpHZidfn4H95jO88ViSaI7mgJLnm7K9fqrch8Ma-R-pbRaS1slspAum7UmBsa5ljbxJc1EUtDNWRt0CN");
            
            MediaType mediaType = MediaType.parse("application/json; charset=utf-8");
            
            String  stringJson = "";
            
            
            switch (tipo){
                case NOTIFICACAO:
                    stringJson = criarNotificacao(usuario , "Notificacao" , "Ola voce esta recebendo uma notificacao.");
                    break;
                    
                case MENSAGEM:
                    stringJson = criarMessageData(usuario);
                    break;
            }
            
            RequestBody requestBody = RequestBody.create(mediaType, stringJson) ; 
            requestBuilder.post(requestBody) ; 
            
            Request request  = requestBuilder.build();
            
            Response response = client.newCall(request).execute() ; 
            
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
        
    }
    
    
    private String criarNotificacao(Usuario usuario , String title , String body){
        FcmNotificacao fcmNotificacao = new FcmNotificacao();
        fcmNotificacao.setTo(usuario.getToken());
        fcmNotificacao.getNotification().setBody(body);
        fcmNotificacao.getNotification().setTitle(title);
        return createGson(fcmNotificacao);
    }

    private String criarMessageData(Usuario usuario){
        FcmData fcmData =new FcmData();
        fcmData.setTo(usuario.getToken());
        fcmData.getData().setTime("15:10");
        fcmData.getData().setScore("5x1");
        fcmData.getData().setMessage(usuario.getMensagem());
        return createGson(fcmData);
    }
    
    
    private String createGson(Object objeto){
        Gson gson = new Gson();
        String  stringJson =  gson.toJson(objeto);
        System.out.println(stringJson);
        return stringJson;
    }
    
    
}
