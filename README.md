# Event CRUD
Application MOBILE - SPRING BOOT ( BACK-END ) et Flutter ( Front-END )

### Etapes a suivre pour deployer le project complet:

#### 1- telecharger et installer Postgresql -_- : https://www.postgresql.org/download/
   
#### 2-Importer le projet 'Backend-API-Springboot' sur Eclipse ou autre IDE :

- Modifier le fichier`/src/main/ressources/application.properties` avec votre propre configuration Postgresql

    ```
	spring.datasource.url=jdbc:postgresql://localhost:5432/pfa
	spring.datasource.username=postgres
  	spring.datasource.password=abijoue 
    ```    
	
#### 3-Demarrer le Project sur Eclipse et utiliser Swagger ( JSON API documentation for spring based applications ) :
    
  - http://localhost:8080/v2/api-docs     ( swagger 2 ) 
	![](/images/swagger.png)
  - http://localhost:8080/swagger-ui.html ( swagger-ui )
	![](/images/swagger-ui-doc.png)

        
#### 4- Importer le dossier `Frontend-Flutter ` sur Visual studio code ( ou editeur do votre choix ) :

    	- lancer le projet sur un emulateur : flutter run 
	- en cas de problème : flutter doctor
#### 5- Code source : dans la branche : Master ( branche actuelle : Main )
#### 6- screen shoots
![](/images/collection.jpg)
#### 7- video demo
https://mega.nz/file/oV8ymLiC#eu1Jd956UjikgWbTAZ_Dmzh9kCzLtphuJHl7gkc4j4o

    
    
