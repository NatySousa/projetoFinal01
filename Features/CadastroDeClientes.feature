#language: pt
#encoding: iso-8859-1

Funcionalidade: Cadastro de Clientes
	como um usu�rio do sistema
	eu quero cadastrar um cliente
	para que eu possa gerenciar clientes
	
Cen�rio: Cadastro de clientes com sucesso
	Preencher todos os campos e verificar se o sistema 
  realiza o cadastro do cliente com sucesso.

  Dado Acessar a p�gina de cadastro de clientes
	E Informar o nome "Ana Paula da Silva"
	E Informar o RG "1234567890"
	E Informar o CPF "32145687600"
	E Informar a data de nascimento "10/01/1985"
	Quando Confirmar a realiza��o do cadastro
	Ent�o Sistema exibe a mensagem "Processo realizado com sucesso"
	