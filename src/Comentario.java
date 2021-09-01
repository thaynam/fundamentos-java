import jdk.swing.interop.SwingInterOpUtils;

public class Comentario {

    public static void main(String[] args){
        System.out.println("minha primeira aula de fundamentos");
        System.out.println("Saudações!");

        //System.out.println("esta linha será comentada!");
        /*COMENTARIO
         * Este é um comentário de varias linhas.
         proximo é JAVADOC
         */

    }

    /**
     * @author Thaynam
     * @since 1.9
     * @param a - Valor a somar
     * @param b - Valor a somar
     * @return retorna a soma entre a e b
     */
    public int soma(int a,int b) {
        return a + b;
    }
}
