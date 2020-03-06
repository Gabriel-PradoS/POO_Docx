
import java.util.Scanner;
public class Ex6_Prog {
    /* Programação:
     6.	O que chamamos de exceção? Dê exemplo;
    */

        public static void main (String []args ){
            /// Exceções são erros imprevistos que podem acontecer por erro de lógica ou acesso a recursos que talvez não estejam disponíveis
            int num;
            num = null;
            
            try {
                int mult;
                mult = num * 2;
            }
            catch (Error e) {
                num = 3;
                mult = num * 2;
                System.out.println(mult);
            }
            // no caso acima o programa está tentando multiplicar um número por 2, logo acontece um erro e é corrigido pelo catch.
        }
    }
        