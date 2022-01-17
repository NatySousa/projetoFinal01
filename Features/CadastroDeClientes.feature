#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastro de Clientes
	como um usuário do sistema
	eu quero cadastrar um cliente
	para que eu possa gerenciar clientes
	
Cenário: Cadastro de clientes com sucesso
	Preencher todos os campos e verificar se o sistema 
  realiza o cadastro do cliente com sucesso.

  Dado Acessar a página de cadastro de clientes
	E Informar o nome "Ana Paula da Silva"
	E Informar o RG "1234567890"
	E Informar o CPF "32145687600"
	E Informar a data de nascimento "10/01/1985"
	Quando Confirmar a realização do cadastro
	Então Sistema exibe a mensagem "Processo realizado com sucesso"
	