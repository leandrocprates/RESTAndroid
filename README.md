# RESTAndroid - Modelo de Integração de Serviços Rest Java com Google Firebase Cloud Message  

Fire base cloud message tutorial

- **Este Serviço foi criado com o objetivo de disparar uma requisicao para o servidor do FCM para enviar Notificacoes e Mensagem de Dados.**  




A - Obter Token Gerado Pelo FCM no Android : 

dv985ega8Mo:APA91bEpn3pXR3XdTuEgva4UFAQxyAfrJJCy9rVYenUznf1kgpXh4waTsx9TeArkQNDUvQacH5Ya3dRpHOPAHcD8AraJ5D8XZcs0Ss3iWpH-ox0KL9pN3bbiKXWf4T1m4QSzfGlbhbTQ


B - Obter Chave de Autorização no Console do Firebase: 

![Alt text](FCM_Chave.png?raw=true "Imagem Chave FCM")


**Enviar Notificacao pela classe Java ou PostMan direto para o FCM Google:**


https://fcm.googleapis.com/fcm/send

Content Type : application/json

1. Authorization :  Id Obtido no Console do Firebase da sua Aplicação, ver figura acima
2. to :  Token Unico Gerado no Android Pela Instancia di Firebase 


Authorization : key=AAAAGYw4hd8:APA91bG_vtOqwjhgXCbtwLltqUJuWSIF_H4ScHybfNhWoJ5JNxEnLKogPwyzfpHZidfn4H95jO88ViSaI7mgJLnm7K9fqrch8Ma-R-pbRaS1slspAum7UmBsa5ljbxJc1EUtDNWRt0CN

Notificacao : 

```json

{ 
  "notification": {
    "title": "Portugal vs. Denmark",
    "body": "5 to 1"
  },
  "to" : "dv985ega8Mo:APA91bEpn3pXR3XdTuEgva4UFAQxyAfrJJCy9rVYenUznf1kgpXh4waTsx9TeArkQNDUvQacH5Ya3dRpHOPAHcD8AraJ5D8XZcs0Ss3iWpH-ox0KL9pN3bbiKXWf4T1m4QSzfGlbhbTQ"
}
```

Data Message : 

```json
{ 
  "data": {
    "score": "5x1",
    "time": "15:10"
  },
  "to" : "dv985ega8Mo:APA91bEpn3pXR3XdTuEgva4UFAQxyAfrJJCy9rVYenUznf1kgpXh4waTsx9TeArkQNDUvQacH5Ya3dRpHOPAHcD8AraJ5D8XZcs0Ss3iWpH-ox0KL9pN3bbiKXWf4T1m4QSzfGlbhbTQ"
}

```

## Serviços Rest Definidos na Classe HelloWorldRestController.java 

1. Enviar Notificacao  

http://localhost:8080/RESTAndroid/enviarNotificacao


Content Type : application/json

```json

{ 
    "token" : "ft5FOps7PCY:APA91bEg4N6o7KwDh9f_ZhyRCieh5dq02lwJIExfyW9QzPXcX1M7irhXkpk8R6HaDFxtpGNOfhNTFuMbHKiR38KT9FjPIt403Uhn3uFEqg1KY7FwnBVWQCk6JF2rUahAjtCGp-oLo_m5" , 
    "email" : "leandro.prates@mobile.com" , 
    "mensagem" : "Notificacao vinda direta de servivo rest para celular MOTO G3 "
} 

```

2. Enviar Mensagem 

http://localhost:8080/RESTAndroid/enviarMensagem


Content Type : application/json

```json

{ 
    "token" : "ft5FOps7PCY:APA91bEg4N6o7KwDh9f_ZhyRCieh5dq02lwJIExfyW9QzPXcX1M7irhXkpk8R6HaDFxtpGNOfhNTFuMbHKiR38KT9FjPIt403Uhn3uFEqg1KY7FwnBVWQCk6JF2rUahAjtCGp-oLo_m5" , 
    "email" : "leandro.prates@mobile.com" , 
    "mensagem" : "Mensagem vinda direta de servivo rest para celular MOTO G3 "
} 

```








