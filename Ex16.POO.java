/*
16.	O que são classes abstratas? Dê exemplo;
(PESQUISA REALIZADA NA INTERNET PARA RESPONDER)
São classes mais gerais que servem para ser herdadas por outras classes.
Funciona como um rascunho para outras classes, que vão herdar e então utilizar os mesmos atributos e métodos dessa classe.

Por exemplo: 
    public abstract class Funcionario {

        protected double salario;

        public double getBonificacao() {
            return this.salario * 1.2;
        }

        Acima está a classe abstrara
_______________________________________________________________________________________-

    public class Gerente extends Funcionario {

        public double getBonificacao() {
            return this.salario * 1.4 + 1000;
        }
    }

    Essa segunda classe herda a classe abstrata, utiliza seus membros e ainda adiciona coisas a mais.
*/
