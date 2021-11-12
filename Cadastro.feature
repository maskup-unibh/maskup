Funcionalidade:Cadastro no Site
Os usuários devem conseguir realizar o cadastro no App inserindo Nome,Cpf,Email e Data de Nascimento, 
para acessar as vagas de empregos disponíveis.

    Cenario: Cadastro bem sucedido
      Quando Quando o Usúario pressionar o botão de Novo Cadastro
      E é direcionado para a tela de Cadastro
      E insere Nome Válido
      E insere Email Válido
      E insere Cpf Válido
      E insere Senha Válida 
      E pressionando Cadastre-se
      Entao deve aparecer um aviso indicando foi cadastrado com sucesso
      E deve retornar a tela inicial
      E conseguir efetuar o login com sucesso

    Cenario: Email não informado
      Quando Quando o Usúario pressionar o botão de Novo Cadastro
      E é direcionado para a tela de Cadastro
      E insere Nome Válido
      E não insere o Email
      E insere Cpf Válido
      E insere Senha Válido
      E insere a Confirmação da senha que corresponde com a Senha
      E pressiona Cadastre-se
      Entao deve aparecer um aviso indicando que o Email não foram preenchidos

      Cenario: Senha não informado
      Quando Quando o Usúario pressionar o botão de Novo Cadastro
      E é direcionado para a tela de Cadastro
      E insere Nome Válido
      E insere Email Válido
      E insere Cpf Válido
      E não insere Senha 
      E não insere a Confirmação da senha 
      E pressiona Cadastre-se
      Entao deve aparecer um aviso indicando que a Senha não foram preenchidos

      Cenario: Senha divergente
      Quando Quando o Usúario pressionar o botão de Novo Cadastro
      E é direcionado para a tela de Cadastro
      E insere Nome Válido
      E insere Email Válido
      E insere Cpf Válido
      E insere Senha Válida
      E insere a Confirmação da senha que não corresponde com a Senha
      E pressiona Cadastre-se
      Entao deve aparecer um aviso indicando que as Senhas não correspondem

      Cenario: Nenhum Campo Preechido
      Quando Quando o Usúario pressionar o botão de Novo Cadastro
      E é direcionado para a tela de Cadastro
      E não insere Nome 
      E não insere Email 
      E não insere Cpf Válido
      E não insere Senha 
      E não insere a Confirmação da senha 
      E pressiona Cadastre-se
      Entao deve aparecer um aviso indicando que os campos Nome,Email,Cpf,Senha e Confirmação de senha não foram preenchidos