#language: pt

@processo
Funcionalidade: Visualizar processo

  Contexto: o usuário querer visualizar um processo
    Dado que o usuário esta na página inicial
    E o usuário clicar no menu Processos

  Esquema do Cenario: usuário visualizando um processo
    Quando o usuário clicar no botão mostrar do processo "<id>"
    E o usuário devera ver o campo "vara" igual a "<vara>"
    E o usuário devera ver o campo "número processo" igual a "<numero_processo>"
    E o usuário devera ver o campo "natureza" igual a "<natureza>"
    E o usuário devera ver o campo "partes" igual a "<partes>"
    E o usuário devera ver o campo "urgente" igual a "<urgente>"
    E o usuário devera ver o campo "arbitramento" igual a "<arbitramento>"
    E o usuário devera ver o campo "assistente social" igual a "<assistente_social>"
    E o usuário devera ver o campo "data entrada" igual a "<data_entrada>"
    E o usuário devera ver o campo "data saida" igual a "<data_saida>"
    E o usuário devera ver o campo "data agendamento" igual a "<data_agendamento>"
    E o usuário devera ver o campo "status" igual a "<status>"
    E o usuário devera ver o campo "observacao" igual a "<observacao>"

    Exemplos:
      | id    | vara                       | numero_processo | natureza    | partes  | urgente | arbitramento | assistente_social | data_entrada | data_saida | data_agendamento | status    | observacao   |
      | 2240  | Teste Mateus nao deletar   | 112233          | civil       | nenhum  | N       | N            | Mateus            | 2020-12-08   | 2020-12-10 | 2020-12-09       | Andamento | nenhuma      |
      | 2241  | Teste Mateus nao deletar 2 | 4455            | trabalhista | parte2  | N       | N            | Joao              | 2020-11-01   | 2020-11-05 | 2020-11-04       | Parado    | parado teste |
