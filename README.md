<h1 align="center">Mediator</h1>

<p>O Mediator é um padrão de projeto comportamental que permite que você reduza as dependências caóticas entre objetos. 
  O padrão restringe comunicações diretas entre objetos e os força a colaborar apenas através do objeto mediador.
</p>

##

#### Exemplo 

<p>
Meu exemplo implementa o padrão de projeto Memento em Java, usando duas classes principais: EditorDocumento e EstadoDocumento.

- EditorDocumento: Representa um editor de documento que possui um conteúdo. Ele mantém uma lista de estados anteriores do documento e fornece métodos para salvar o estado atual, desfazer a última ação e refazer a última ação desfeita.

- EstadoDocumento: Representa um estado específico do documento. Ele armazena o conteúdo do documento em um determinado momento.
</p>


