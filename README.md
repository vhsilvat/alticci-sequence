# Alticci-sequence

A sequência Alticci é definida da seguinte forma:

n=0 => a(0) = 0\
n=1 => a(1) = 1\
n=2 => a(2) = 1\
n>2 => a(n) = a(n-3) + a(n-2)

Essa API retorna um valor da sequência Alticci conforme o index indicado.

## Executando a aplicação com o Docker

Após clonar o repositório, builde e execute o container da aplicação:
```shell script
./mvnw package
docker compose build
docker compose up
```

> **_NOTA:_**  É necessário instalar previamente o docker compose, i.e. sudo pacman -S docker-compose

Alternativamente, você pode executar a aplicação localmente:
```shell script
./mvnw package
java -jar target/quarkus-app/quarkus-run.jar
```

## Documentação e especificação

Você pode verificar a especificação do endpoint na documentação: 
```shell script
curl http://localhost:8080/q/openapi
```

Ou, se você preferir testar o endpoint através do swagger-ui, acesse `http://localhost:8080/q/swagger-ui`

