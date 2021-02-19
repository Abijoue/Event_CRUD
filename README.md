# Event_CRUD
Application MOBILE (CRUD) - SPRING BOOT (BACK-END) & FLUTTER(FRONT-END) -

# SpringBoot&flutter

### Etapes a suivre pour deployer le project complet:

#### 1- installer Postgresql *_* 
   
#### 2-Importer le projet `Backend-API-Springboot` sur Eclipse ou autre IDE :

- Modifier le fichier `/src/main/ressources/application.properties ` avec votre propre configuration Postgresql

    ```
		spring.datasource.url=jdbc:postgresql://localhost:5432/pfa
		spring.datasource.username=postgres
	  	spring.datasource.password=abijoue 
    ```    
	
#### 3-Demarrer le Project sur Eclipse et utiliser Swagger ( JSON API documentation for spring based applications ) :
    
  - http://localhost:8080/v2/api-docs     ( swagger 2 ) 
  - http://localhost:8080/swagger-ui.html ( swagger-ui )

	exemple: 
		"/api/events": {
            "get": {
                "tags": [
                    "event-controller"
                ],
                "summary": "getAllEvents",
                "operationId": "getAllEventsUsingGET",
                "produces": [
                    "*/*"
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "type": "array",
                            "items": {
                                "$ref": "#/definitions/Event"
                            }
                        }
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                },
                "deprecated": false
            },
            "post": {
                "tags": [
                    "event-controller"
                ],
                "summary": "createBranche",
                "operationId": "createBrancheUsingPOST",
                "consumes": [
                    "application/json"
                ],
                "produces": [
                    "*/*"
                ],
                "parameters": [
                    {
                        "in": "body",
                        "name": "ev",
                        "description": "ev",
                        "required": true,
                        "schema": {
                            "$ref": "#/definitions/Event"
                        }
                    }
                ],
                "responses": {
                    "200": {
                        "description": "OK",
                        "schema": {
                            "$ref": "#/definitions/Event"
                        }
                    },
                    "201": {
                        "description": "Created"
                    },
                    "401": {
                        "description": "Unauthorized"
                    },
                    "403": {
                        "description": "Forbidden"
                    },
                    "404": {
                        "description": "Not Found"
                    }
                },
                "deprecated": false
            }
        }
        
#### 4- Importer le dossier `Frontend-Flutter ` sur Visual studio code ( ou editeur do votre choix ) :

    - lancer le projet sur un emulateur : flutter run 
	  - en cas de problème : flutter doctor
    
    
    
