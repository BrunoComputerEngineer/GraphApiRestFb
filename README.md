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
Intalar  Selenium WebDriver, TestNG, Utilização do SDK RestFB by Mark Allen
### Casos de teste:
### Pré-requisitos 
Criar um APP no https://developers.facebook.com com todas as permissões.


PASSED: ExtendsToken
PASSED: FacebookAuthentication
PASSED: LoginWithInvalidEmail
PASSED: LoginWithInvalid__password
PASSED: LoginWithInvalid_passwordAndUser
PASSED: LoginWithaAllBlankFields
PASSED: LoginWithoutEmail
PASSED: LoginWithout_password
PASSED: PostTimeLine

##### 1 - ExtendsToken
O teste case é responsavel por aumentar o tempo de expiração do token 
Resultado: O teste retorna o novo token ea data de expiração
##### 2 – FacebookAuthentication
O teste case é responsavel por Fazer a autenticação do facebook atravez da api.
Resultado: O teste retorna o nome do usuario no console

##### 2 - LoginWithInvalidEmail
O Test case é responsavel por validar o login com um email invalido
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.

##### 3 - LoginWithInvalid__password
O Test case é responsavel por validar o login com uma senha  invalida
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro.

##### 4 - LoginWithInvalid_passwordAndUser
O Test case é responsavel por validar o login com um email e senha invalidos
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro..

##### 5 - LoginWithaAllBlankFields
O Test case é responsavel por validar o login com um email e senha em branco
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro..

##### 6 - LoginWithoutEmail
O Test case é responsavel por validar o login com um email  em branco
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro..

##### 7 – postar uma mensagem no time line com sucesso
O Test case é responsavel por validar o login com um email e senha em branco
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro..

##### 8 – LoginWithout_password
O Test case é responsavel por validar o login com uma senha em branco
Resultado: Sistema deverá exibir popup de autenticação do facebook com erro..

##### 9 – PostTimeLine
O Test case é responsavel por inserir um post no time line porem se caso o facebook não aprovou no app não é possivel realizer esse teste







