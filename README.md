# RESTAndroid



Fire base cloud message tutorial

Desktop Emulador : 

dv985ega8Mo:APA91bEpn3pXR3XdTuEgva4UFAQxyAfrJJCy9rVYenUznf1kgpXh4waTsx9TeArkQNDUvQacH5Ya3dRpHOPAHcD8AraJ5D8XZcs0Ss3iWpH-ox0KL9pN3bbiKXWf4T1m4QSzfGlbhbTQ


Enviar Notificacao pela classe Java ou PostMan direto para o FCM Google 


https://fcm.googleapis.com/fcm/send

Content Type : application/json

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

```json
Data : 

{ 
  "data": {
    "score": "5x1",
    "time": "15:10"
  },
  "to" : "dv985ega8Mo:APA91bEpn3pXR3XdTuEgva4UFAQxyAfrJJCy9rVYenUznf1kgpXh4waTsx9TeArkQNDUvQacH5Ya3dRpHOPAHcD8AraJ5D8XZcs0Ss3iWpH-ox0KL9pN3bbiKXWf4T1m4QSzfGlbhbTQ"
}

```



http://localhost:8080/RESTAndroid/enviarNotificacao


Content Type : application/json

```json

{ 
    "token" : "ft5FOps7PCY:APA91bEg4N6o7KwDh9f_ZhyRCieh5dq02lwJIExfyW9QzPXcX1M7irhXkpk8R6HaDFxtpGNOfhNTFuMbHKiR38KT9FjPIt403Uhn3uFEqg1KY7FwnBVWQCk6JF2rUahAjtCGp-oLo_m5" , 
    "email" : "leandro.prates@mobile.com" , 
    "mensagem" : "Notificacao vinda direta de servivo rest para celular MOTO G3 "
} 

```


http://localhost:8080/RESTAndroid/enviarMensagem


Content Type : application/json

```json

{ 
    "token" : "ft5FOps7PCY:APA91bEg4N6o7KwDh9f_ZhyRCieh5dq02lwJIExfyW9QzPXcX1M7irhXkpk8R6HaDFxtpGNOfhNTFuMbHKiR38KT9FjPIt403Uhn3uFEqg1KY7FwnBVWQCk6JF2rUahAjtCGp-oLo_m5" , 
    "email" : "leandro.prates@mobile.com" , 
    "mensagem" : "Mensagem vinda direta de servivo rest para celular MOTO G3 "
} 

```








