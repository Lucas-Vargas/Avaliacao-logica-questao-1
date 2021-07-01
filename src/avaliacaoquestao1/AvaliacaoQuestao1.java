
package avaliacaoquestao1;

/**
 * @Lucas da Silva Vargas
 */
public class AvaliacaoQuestao1 {


    public static void main(String[] args) {
       int popA, popB=7000000, porc, cont=0;
       
       for(popA=5000000; popA!=popB; cont++){
           popA*=1.03;
           popB*=1.02;
       }System.out.println("Demorou "+cont+" anos para que o país \"A\" ("+popA+" pessoas) igualasse sua população com o país \"B\" ("+popB+" pessoas).");
    }
    
}
