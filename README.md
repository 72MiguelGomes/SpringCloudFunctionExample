# Spring Cloud Function Example

This project is a simple example how to use spring cloud function.

## How to test

```bash
curl localhost:8080/sayHello -H "Content-Type: text/plain" -d "Miguel"
```

```bash
curl --location --request POST 'localhost:8080/healthCheckConsumer' \
--header 'Content-Type: application/json' \
--data-raw '{
	"id": 10,
	"name": "Miguel Gomes"
}'
```