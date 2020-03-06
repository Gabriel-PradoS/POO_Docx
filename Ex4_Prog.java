public class Ex4_Prog {
    /* Programação:
     4.	O que é loop? Dê exemplos (mais de um);
    */
        public static void main (String []args ){
            /* Loop também pode ser chamado de laço,
             é quando precisamos executar uma série de comandos enquanto uma condição for verdadeira
            */
            int cont;
            cont = 0;
            while (cont < 3){
                System.out.println(cont);
                cont = cont + 1;
            }
            // No exemplo acima foi criado um laço que roda enquanto a variável cont for menor que 3.

            for (cont = 0; cont < 3; cont++){
                System.out.println(cont);
            }
            // No exemplo acima acontece a mesma coisa, porém usando outro comando.
        }
    }
        