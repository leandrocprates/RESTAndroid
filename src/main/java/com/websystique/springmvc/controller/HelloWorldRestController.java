
package com.websystique.springmvc.controller;


import com.websystique.springmvc.dao.SalvarUserDao;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import com.websystique.springmvc.domain.Message;
import com.websystique.springmvc.http.HttpClient;
import com.websystique.springmvc.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
 
@RestController
public class HelloWorldRestController {
 
        
    @RequestMapping("/")
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
 
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {//REST Endpoint.
         Message msg = new Message(player, "Hello " + player);
        return msg;
    }
    
    
    @RequestMapping(value="/token" , method = RequestMethod.POST )
    public ResponseEntity<Usuario> recebeToken(@RequestBody Usuario usuario ){
        System.out.println("Email:" + usuario.getEmail());
        System.out.println("Token:" + usuario.getToken());
        
        SalvarUserDao salvarUserDao = new SalvarUserDao(); 
        salvarUserDao.salvarUsuario(usuario);
        
        return new ResponseEntity<Usuario>(usuario , HttpStatus.OK);
    } 
    

    @RequestMapping(value="/enviarMensagem" , method = RequestMethod.POST )
    public ResponseEntity<String> enviaMensagem(@RequestBody Usuario usuario ){
        System.out.println("Email:" + usuario.getEmail());
        System.out.println("Token:" + usuario.getToken());
        System.out.println("Mensagem:" + usuario.getMensagem());
        
        HttpClient httpClient = new HttpClient();
        httpClient.criarRequisicao(usuario, HttpClient.Tipo.MENSAGEM);
        
        return new ResponseEntity<String>("Mensagem Enviada" , HttpStatus.OK);
    } 

    
    @RequestMapping(value="/enviarNotificacao" , method = RequestMethod.POST )
    public ResponseEntity<String> enviaNotificacao(@RequestBody Usuario usuario ){
        System.out.println("Email:" + usuario.getEmail());
        System.out.println("Token:" + usuario.getToken());
        System.out.println("Mensagem:" + usuario.getMensagem());
        
        HttpClient httpClient = new HttpClient();
        httpClient.criarRequisicao(usuario, HttpClient.Tipo.NOTIFICACAO);
        
        return new ResponseEntity<String>("Mensagem Enviada" , HttpStatus.OK);
    } 

    
    
}