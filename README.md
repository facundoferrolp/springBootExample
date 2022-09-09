# Ejemplo Spring Bot 

## Tecnologia

### Spring 2.7.3
### Spring WEB
### Spring Data
### Utiliza una base H2 en memoria

Curls de prueba:

curl --location --request POST 'http://localhost:8081/mascotas' \
--header 'Content-Type: application/json' \
--data-raw '{
"nombre":"perrito",
"nombreDeDuenio":"Nombre del dueño"
}'

curl --location --request POST 'http://localhost:8081/mascotas' \
--header 'Content-Type: application/json' \
--data-raw '{
"nombre":"perrito2",
"nombreDeDuenio":"Nombre del dueño2"
}'

curl --location --request GET 'http://localhost:8081/mascotas?nombre=perrito2'

curl --location --request GET 'http://localhost:8081/mascotas'

curl --location --request GET 'http://localhost:8081/mascotas/1'
