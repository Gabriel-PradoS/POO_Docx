/*
14.	O que é override? Dê exemplo;

(PESQUISA REALIZADA PARA RESPONDER)

Reescrever um método que foi herdado, aonde seu comportamento na classe Pai, se difere do seu comportamento na classe filha.
Ou seja, eles possuem o mesmo nome, mas, funcionalidades ou ações diferentes.

Exemplo:
public class Pai {    
    public int Soma(int value){
        return value + 100;
    }
}

public class Filho extends Pai {
    @Override
    public int Soma(int value){
        return value + 200;
    }
}
*/
