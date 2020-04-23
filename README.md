# Microservice with Spring boot and Docker

One Paragraph of project description goes here

## Prerequisites

you should install Java >=8 and Docker


### Installing

git clone https://github.com/joserafael872/consume-repository-crud.git

mvnw clean package

docker build -t consume-repository-crud .

docker run -d -p 2221:2221 consume-repository-crud


#### Description

Este Microservicio contiene 2 APIS y se conecta mediante un cliente feign a el API de persistencia para poder insertar
información de clientes y permite hacer la busqueda por nombre de los mismos, este microservicio se registra a un Eureka server para poder tener comunicación con el API de persistencia. 	
      
1. Insertar clientes
2. Obtener información de un cliente en específico.

#### Versioning

0.0.1

#### Last modification date:
22/04/2020 by Deployment José Rafael


### To Do


### Endpoints
> /crud/insert-data-customer POST

### Request data

URL : 
localhost:2221/crud/insert-data-customer

> Test data : 

> **Request OK: ** {
  "nombre": "JUAN",
  "apellidos": "FRANCISCO PALENCIA",
  "fecha_nacimiento": "05/05/1987",
  "sexo": "M",
  "numero_cuenta": "123456789",
  "saldo": "765",
  "producto": "CLASICA"
}

### Response data

http status de ok "200"

### Endpoints
> /crud/get-data-customer POST

### Request data

URL : 
localhost:2221/crud/get-data-customer

> Test data : 

> **Request OK: ** {
    "nombre": "JUAN"
}

> **Response OK: ** {
	"nombre": "JUAN",
    "apellidos": "FRANCISCO PALENCIA",
    "fecha_nacimiento": "05/05/1987",
    "sexo": "M",
    "cuentas": [
        {
            "numero_cuenta": "123456789",
            "saldo": "765",
            "producto": "CLASICA"
        },
        {
            "numero_cuenta": "123456789",
            "saldo": "345",
            "producto": "PREMIER"
        }
    ]    
}
