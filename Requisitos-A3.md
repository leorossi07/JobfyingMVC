# Requisitos do Sistema

# REST API -- CRUD de Candidaturas

## Cria uma nova Candidatura: C (CREATE) do CRUD

POST - http://localhost:8080/api/candidaturas

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

JSON de entrada
```
{

    "data": "2024-09-20T10:00:00",
    "status": "Em Análise",
    "usuario": {
        "id": 1
    },
    "vaga": {
        "id": 3,
        "salario" : 22000.00
    }
}

```


## Lê todas as Candidaturas: R (READ) do CRUD

GET - http://localhost:8080/api/candidaturas

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado


## Lê as candidaturas com um ID específico: R(READ) do CRUD

GET - http://localhost:8080/api/candidaturas/1

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Saída JSON
```
{
    "id": 1,
    "data": "15/09/2024 16:49:34",
    "salario": 12000.00,
    "status": "Aberto"
}
```

## Atualiza uma Candidatura: U(UPDATE) do CRUD)

PUT - http://localhost:8080/api/candidaturas/5

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado
      
Entrada JSON
```
{
    "id": 5,
    "data": "2024-09-20T10:00:00",
    "status": "Em Análise (PUT)",
    "usuario": {
        "id": 1
    },
    "vaga": {
        "id": 3,
        "salario" : 22000.00
    }
}
```

Saída JSON

```
{
    "id": 5,
    "data": "2024-09-20T10:00:00",
    "salario": 22000.00,
    "status": "Em Análise (PUT)"
}
```

## Deletar Candidatura: D(DELETE) de CRUD

DELETE - http://localhost:8080/api/candidaturas/5

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Saída: ```true```

# REST API - CRUD de EMPRESAS

## Cria uma nova empresa: C(CREATE) de CRUD

POST - http://localhost:8080/api/empresas

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Entrada JSON

```
{
    "cnpj": "12.345.888/0001-90",
    "nome": "BlockBuster Corporation"
}
```

Saída JSON

```
{
    "id": 11,
    "nome": "BlockBuster Corporation",
    "cnpj": "12.345.888/0001-90"
}
```

## Retorna lista de empresas: R(READ) do CRUD

GET - http://localhost:8080/api/empresas

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado


## Retorna empresa por id : R(READ) do CRUD

GET - http://localhost:8080/api/empresas/11

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Saída JSON

```
{
    "id": 11,
    "nome": "BlockBuster Corporation",
    "cnpj": "12.345.888/0001-90"
}

```

## Retorna a lista de todas as empresas da cidade de nome = {nome}

- [ ] Implementado
- [ ] Parcialmente implementado
- [X] Não implementado

## Atualiza a empresa de id = {id} [Update - CRUD]

PUT - http://localhost:8080/api/empresas/11

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Entrada JSON

```
{
    "cnpj": "12.345.788/0001-90",
    "nome": "Tech Corporation"
}
```
Saída JSON

```
{
    "id": 11,
    "nome": "Tech Corporation",
    "cnpj": "12.345.788/0001-90"
}
```

## Remove a empresa de id = {id} [Delete - CRUD]

DELETE - - http://localhost:8080/api/empresas/11

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Saída é ```true```, a não ser que a empresa tenha vagas cadastradas.

# REST API - Vagas

## Retorna a lista de vagas [Read - CRUD]

GET http://localhost:8080/api/vagas

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

## Retorna a vaga de id = {id} [Read - CRUD]

GET http://localhost:8080/api/vagas/5

- [X] Implementado
- [ ] Parcialmente implementado
- [ ] Não implementado

Saída JSON

```
{
    "id": 9,
    "titulo": "Mobile Developer",
    "descricao": "Desenvolver e otimizar aplicações móveis para iOS e Android.",
    "cargaHoraria": 40,
    "salario": 11500.00
}
```
## Retorna a lista de vagas (em aberto) da empresa de id = {id} [Read - CRUD]

- [ ] Implementado
- [ ] Parcialmente implementado
- [X] Não implementado



