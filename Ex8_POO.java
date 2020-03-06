/* 
8.	O que é visibilidade de uma classe, método, propriedade ? Dê exemplo;
(REALIZADA PESQUISA PARA RESPONDER)
Existem quatro graus de visibilidade que podem ser usados em membros de uma classe:
Nenhuma:
Nesse caso ela se caracteriza como publica para pacote.

Public: 
A palavra-chave public modiﬁca essa visibilidade de forma a ampliá-la, deixando-a sem restrições.
Private:
A palavra-chave private restringe a visibilidade do membro modiﬁcado, método ou atributo, exclusivamente a objetos da própria classe que contém sua deﬁnição. 
Protect:
A palavra-chave protected restringe a visibilidade do membro modiﬁcado, atributo ou método, apenas à própria classe e àquelas derivada desta.

public class Ex8_POO {
    public String modelo;
    protected String cor;
    private float tamanho;
    
}
No exemplo acima foram definidas as visibilidades de atributos.
*/
