/*
13.	O que é implementação? Dê exemplo;
(REALIZADA PESQUISA PARA RESPONDER)

A implementação funciona como uma assinatura de um contrato, uma interface pode possuir vários métodos,
o objeto que implementar essa interface (assinar esse contrato), será obrigado a utilizar esses métodos. 

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    // outros atributos e métodos

    public boolean autentica(int senha) {
        if(this.senha != senha) {
            return false;
        }
        // pode fazer outras possíveis verificações, como saber se esse 
        // departamento do gerente tem acesso ao Sistema

        return true;
    }

}
*/