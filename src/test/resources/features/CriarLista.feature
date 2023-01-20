#language: pt
#encoding: UTF-8

Funcionalidade: Microsoft To do


Contexto: Criar lista
Dado que o usuario digite email ou phone number "qamaratona@gmail.com"
E clique em sign in
E digite a senha do usuario "M@ratona123"
E clique em sign in
Quando o usuario acionar o botao new list
E informar no campo enter list title "Lista1"
E acionar o campo create list
Quando voltar para a pagina de listas
Entao o aplicativo cadastra a lista "Lista1"

@editar
Cenario: editar lista
Quando selecionar a lista criada
E o usuario clicar no nome da lista criada
E informar o novo nome "ListaEditada"
E clicar no botao save
E voltar para a pagina de listas
Entao o aplicativo cadastra a lista "ListaEditada"

@adicionaritem
Cenario: adicionar item a lista
Quando selecionar a lista criada
E o usuario acionar o botao mais
E adicionar o item desejado "ItemCriado"
E confirmar a criacao no botao enviar
Entao o item sera adicionado "ItemCriado"

@excluiritem
Cenario: excluir item da lista
Quando selecionar a lista criada
E o usuario acionar o botao mais
E adicionar o item desejado "ItemTeste"
E confirmar a criacao no botao enviar
Quando voltar para a pagina de listas
Quando selecionar a lista criada
E o usuario clicar no item desejado
E selecionar a lixeira para deletar
E clicar em delete task
Entao o item da lista e excluido "ItemTeste"

@excluirlista
Cenario: excluir lista
Quando selecionar a lista criada
E o usuario clicar nas opcoes de lista
E clicar em delete lista
E confirmar o delete da lista
Entao o sistema valida a exclusao da lista
