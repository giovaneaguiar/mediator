<h1 align="center">Mediator</h1>

<p>O Mediator é um padrão de projeto comportamental que permite que você reduza as dependências caóticas entre objetos. 
  O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.
</p>

##

#### Exemplo 1

<p>
Meu exemplo simula a comunicação entre diferentes voos e uma torre de controle, onde os voos solicitam aterrisagem e a torre de controle decide quando autorizar a aterrisagem.

Neste exemplo:

- TorreDeControle atua como um mediador entre diferentes voos (Voo).
Cada instância de Voo pode solicitar aterrisagem através do método solicitarAterrisagem().
- A TorreDeControle recebe essas solicitações através do método solicitarAterrisagem() do Mediador.
Quando a TorreDeControle decide autorizar a aterrisagem, ela chama o método autorizarAterrisagem() no Mediador.
- O Mediador (a TorreDeControle) notifica todos os voos que solicitaram aterrisagem, chamando seus métodos aterrissar().
</p>


