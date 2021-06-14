# Event_CRUD
Application MOBILE ( CRUD ) - SPRING BOOT ( BACK-END ) & FLUTTER( FRONT-END ) -

### Etapes a suivre pour deployer le project complet:

#### 1- telecharger et installer Postgresql -_- : https://www.postgresql.org/download/ 
   
#### 2-Importer le projet `Backend-API-Springboot` sur Eclipse ou autre IDE :

- Modifier le fichier `/src/main/ressources/application.properties ` avec votre propre configuration Postgresql

    ```
		spring.datasource.url=jdbc:postgresql://localhost:5432/pfa
		spring.datasource.username=postgres
	  	spring.datasource.password=abijoue 
    ```    
	
#### 3-Demarrer le Project sur Eclipse et utiliser Swagger ( JSON API documentation for spring based applications ) :
  - http://localhost:8095/rest/users/all ( simple GET)
  	![](/images/image1.png)
  - http://localhost:8080/swagger-ui.html ( swagger-ui )
	![](/images/image2.png)
### 4 - database file 
	CH.json OR CH.csv
    
    
