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








