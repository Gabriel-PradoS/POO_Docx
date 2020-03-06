/*
12.	O que é polimorfismo? Dê exemplo;

(REALIZADA PESQUISA PARA RESPONDER)
O polimorfismo permite a utilização de um mesmo elemento de formas diferentes.
Ou seja, um objeto pode se comportar de maneiras diferentes dependendo da mensagem que recebe.

class Empregado {
    int quantiaAPagar() {
        return _tipo.quantiaAPagar(this);
    }
}
 
class TipoDeEmpregado {
 
    abstract int quantiaAPagar(Empregado emp);
}
 
class Engenheiro extends TipoDeEmpregado {
    int quantiaAPagar(Empregado emp) {
        return emp.lerSalarioMensal();
    }
}
 
class Vendedor extends TipoDeEmpregado {
    int quantiaAPagar(Empregado emp) {
        return emp.lerSalarioMensal() + emp.lerComissao();
    }
}
 
class Gerente extends TipoDeEmpregado {
    int quantiaAPagar(Empregado emp) {
        return emp.lerSalarioMensal() + emp.lerBonus();
    }
}

A essência do polimorfismo é que, em vez de perguntar a um objeto qual é o seu tipo e então chamar algum comportamento baseado nessa resposta, você simplesmente chama o comportamento. O objeto, dependendo do seu tipo, faz a coisa certa.
*/