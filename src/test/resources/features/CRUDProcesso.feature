#language: pt

  @processo
  Funcionalidade: CRUD processos

    Cenário: usuário gostaria de criar um novo processo
      Dado que o usuário esta na página inicial
      Quando o usuário clicar no menu Processos
      E o usuário clica no botão Novo Processo
      E o usuário preenche o campo "vara" com o valor "vara123"
      E o usuário preenche o campo "número processo" com o valor "p123"
      E o usuário preenche o campo "natureza" com o valor "civil"
      E o usuário preenche o campo "partes" com o valor "parte1"
      E o usuário preenche o campo "urgente" com o valor "Sim"
      E o usuário preenche o campo "arbitramento" com o valor "Sim"
      E o usuário preenche o campo "assistente social" com o valor "Mateus"
      E o usuário preenche o campo "data entrada" com o valor "28/10/1996"
      E o usuário preenche o campo "data saida" com o valor "30/10/1996"
      E o usuário preenche o campo "data agendamento" com o valor "29/10/1996"
      E o usuário preenche o campo "status" com o valor "Andamento"
      E o usuário preenche o campo "observação" com o valor "nenhuma"
      Quando o usuário clicar no botão Salvar
      Então o usuário devera ver a mensagem "Processo foi criado com sucesso."

    Cenário: usuário gostaria de visualizar um processo
      Dado que o usuário esta na página de detalhes do processo
      E o usuário clica no botão voltar
      Quando o usuário clicar no botão mostrar
      E o usuário devera ver o campo "vara" igual a "vara123"
      E o usuário devera ver o campo "número processo" igual a "p123"
      E o usuário devera ver o campo "natureza" igual a "civil"
      E o usuário devera ver o campo "partes" igual a "parte1"
      E o usuário devera ver o campo "urgente" igual a "S"
      E o usuário devera ver o campo "arbitramento" igual a "S"
      E o usuário devera ver o campo "assistente social" igual a "Mateus"
      E o usuário devera ver o campo "data entrada" igual a "1996-10-28"
      E o usuário devera ver o campo "data saida" igual a "1996-10-30"
      E o usuário devera ver o campo "data agendamento" igual a "1996-10-29"
      E o usuário devera ver o campo "status" igual a "Andamento"
      E o usuário devera ver o campo "observacao" igual a "nenhuma"

    Cenário: usuário gostaria de editar um processo
      Dado que o usuário esta na página de detalhes do processo
      E o usuário clica no botão voltar
      Quando o usuário clicar no botão editar
      E o usuário preenche o campo "vara" com o valor "vara12345"
      E o usuário preenche o campo "número processo" com o valor "p12345"
      E o usuário preenche o campo "natureza" com o valor "trabalhista"
      E o usuário preenche o campo "partes" com o valor "parte123"
      E o usuário preenche o campo "urgente" com o valor "Não"
      E o usuário preenche o campo "arbitramento" com o valor "Não"
      E o usuário preenche o campo "assistente social" com o valor "Mateus Renato"
      E o usuário preenche o campo "data entrada" com o valor "27/10/1998"
      E o usuário preenche o campo "data saida" com o valor "29/10/1998"
      E o usuário preenche o campo "data agendamento" com o valor "28/10/1998"
      E o usuário preenche o campo "status" com o valor "Finalizando"
      E o usuário preenche o campo "observação" com o valor "n/a"
      Quando o usuário clicar no botão Salvar
      Então o usuário devera ver a mensagem "Processo atualizado com sucesso."

    Cenário: usuário gostaria de apagar um processo
      Dado que o usuário esta na página de detalhes do processo
      E o usuário clica no botão voltar
      Quando o usuário clicar no botão apagar
      E o usuário confirmar a ação de apagar
      Então o usuário não deve visualizar o processo na lista



