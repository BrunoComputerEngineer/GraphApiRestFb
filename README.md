#Desafio Sensedia 

Utilizando a API do facebook: https://developers.facebook.com fazer levantamento dos cenários
e realizar a automação desses cenários levantados utilizando uma ferramenta de sua
preferência para a seguinte regra de negócio. Devem ser considerados casos de sucesso e
fluxos alternativos.
Sugestões de ferramentas: Postman, Selenium Webdriver.
Sugestões de linguagens: Node, Java, Python, Javascript.
Ao finalizar o levantamento dos cenários e a automação, poste no github ou bitbucket o código
e cenários. Não se esqueça de deixar público e nos enviar o link.
Especificação de Requisito
O usuário deve realizar a autenticação no facebook.
(https://developers.facebook.com/docs/facebook-login/access-tokens)
O usuário deve postar uma mensagem na página desse mesmo usuário.
(https://developers.facebook.com/docs/graph-api/reference/v3.0/user/feed)
Realizar uma alteração na mensagem postada acima.

Referência: https://developers.facebook.com
#Ferramenta Utilizada 
Java, AssuredRest, bitbucket, postman, Selenium WebDriver
# Especificação de Requisito
O usuário deve realizar a autenticação no facebook.
(https://developers.facebook.com/docs/facebook-login/access-tokens)
O usuário deve postar uma mensagem na página desse mesmo usuário.
(https://developers.facebook.com/docs/graph-api/reference/v3.0/user/feed)
Realizar uma alteração na mensagem postada acima.

### Montar ambiente:
Intalar  Selenium WebDriver
### Casos de teste:
### Pré-requisitos 
Criar um APP no https://developers.facebook.com com todas as permissões e atribuir um usuário de teste para realizar as requisições.

##### 1 - Autenticação no facebook com sucesso

- Acessar url   informando permissões do APP .
Resultado: Sistema deverá direcionar para http://localhost e informar  e o token de acesso na URL do browser sendo salva num String para ser utilizada.
##### 2 – Autenticação no facebook com todos os campos em branco
- Acessar url   informando permissões do APP .
Resultado: Sistema deverá direcionar para http://localhost e informar  e o token de acesso na URL do browser sendo salva num String para ser utilizada.
Resultado: Sistema deverá exibir popup de autenticação do facebook de erro.
##### 2 - Autenticação no facebook sem informar  email
- Acessar url   informando permissões do APP .
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.
##### 3 - Autenticação no facebook com uma senha invalida
- Acessar url   informando permissões do APP .
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.
##### 4 - Autenticação no facebook sem informar  invalido email
- Acessar url   informando permissões do APP .
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.
##### 5 - Autenticação no facebook sem informar  email e senha
- Acessar url   informando permissões do APP .
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.
##### 6 - Autenticação no facebook sem informar  senha
- Acessar url   informando permissões do APP .
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.
##### 7 – postar uma mensagem no time line com sucesso
- Acessar url  informando permissões do APP .
Resultado: Sistema deverá permitir a postagem de uma mensagem no time line do usuário.

##### 8 – Tentar postar uma mensagem no timeline com token invalido
- Acessar url   informando permissões do APP .
Resultado: Sistema devera mostrar uma messagem de retorno não permitindo a inserção da mensagem no timeline
##### 9 – Atualizar a mensagem inserida anteriormente no caso 7
- Acessar url   informando permissões do APP .
Resultado: O sistema permitira atualizar a mensagem inserida.






