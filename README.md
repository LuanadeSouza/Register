# Register
O aplicativo consiste em 4 fluxos diferentes (implementados como atividades):

Registro : O usuário pode se registrar introduzindo nome de usuário, senha e aceitando nossos termos e condições.
Login : o usuário pode fazer login usando as credenciais introduzidas durante o fluxo de registro e também pode cancelar o registro do aplicativo.
Página inicial : o usuário é bem-vindo e pode ver quantas notificações não lidas ele possui.
Configurações : o usuário pode fazer logout e atualizar o número de notificações não lidas (o que produz um número aleatório de notificações).
O projeto segue um padrão MVVM, onde toda a complexidade da View é transferida para um ViewModel.


Também uso o Dagger para realizar injeção de campo

Por que Dagger?
Se o aplicativo ficar maior, começaremos a escrever muitos códigos clichê (por exemplo, com fábricas) que podem estar sujeitos a erros. Fazer isso da maneira errada
pode levar a erros sutis e vazamentos de memória.

Dagger se encarregará de criar o gráfico do aplicativo, automatizando esse processo e gerando o mesmo código que teria escrito à mão de outra forma.
