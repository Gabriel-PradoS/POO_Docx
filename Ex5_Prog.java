import java.util.EventListener;
import java.util.Scanner;
public class Ex5_Prog {
    /* Programação:
     5.	O que é estrutura de decisão? Dê exemplos (mais de um);
    */

        public static void main (String []args ){
            // Estrutura de decisão é utilizada para decidir entre duas ou mais opções.
            int par;
            Scanner ler = new Scanner (System.in);
            par = ler.nextInt();

            if (par % 2 == 0){
                System.out.println("O número é par");
            }   else {
                    System.out.println("O número não é par");
            }
            // No exemplo acima o usuário insere um número e de acordo com o número inserido a estrutura vai decidir se é par ou não
            int decisao;
            decisao = 2;
            switch(decisao)
		    {
                case 2: 
                    System.out.println("O valor é 2");
                    break;
                case 1:
                    System.out.println("O valor é 1");
                    break;
            }
            // No exemplo acima o código verifica se a variável decisão vale 1 ou 2
        }
    }
        