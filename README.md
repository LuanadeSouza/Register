# Register
O aplicativo consiste em 4 fluxos diferentes (implementados como atividades):

Registro : O usuário pode se registrar introduzindo nome de usuário, senha e aceitando nossos termos e condições.

Login : o usuário pode fazer login usando as credenciais introduzidas durante o fluxo de registro e também pode cancelar o registro do aplicativo.

Página inicial : o usuário é bem-vindo e pode ver quantas notificações não lidas ele possui.

Configurações : o usuário pode fazer logout e atualizar o número de notificações não lidas (o que produz um número aleatório de notificações).
O projeto segue um padrão MVVM, onde toda a complexidade da View é transferida para um ViewModel.

<img width="873" alt="Screen Shot 2021-08-10 at 08 19 27" src="https://user-images.githubusercontent.com/49947803/128859049-49731ff9-77cb-4154-b61a-20eea873166c.png">

Também uso o Dagger para realizar injeção de dependência

Por que Dagger?

Se o aplicativo ficar maior, começaremos a escrever muitos códigos clichê (por exemplo, com fábricas) que podem estar sujeitos a erros. Fazer isso da maneira errada
pode levar a erros sutis e vazamentos de memória.

Dagger se encarregará de criar o gráfico do aplicativo, automatizando esse processo e gerando o mesmo código que teria escrito à mão de outra forma.

<img width="300" alt="register (2)" src="https://user-images.githubusercontent.com/49947803/129240183-37917806-9eb9-4911-a78a-8cefd30438e5.gif">
