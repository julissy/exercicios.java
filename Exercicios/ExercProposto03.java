/*Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem; ok
c) Exiba as cores em ordem alfabética; ok
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto; ok
h) Confira se o conjunto está vazio; ok 
 */



import java.util.*;

public class ExercProposto03 {
    public static void main(String[] args) {
        Set<String> arcoIris = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));
        System.out.println(arcoIris);

        System.out.println("O arco-iris possui " + arcoIris.size() + " cores");

        Set<String> ordemAlfabetica = new TreeSet<>(arcoIris);
        System.out.println("A ordem alfabética das cores do Arco-Iris " + ordemAlfabetica);

        Iterator<String> cores = arcoIris.iterator();



        arcoIris.clear();
        System.out.println("Confira se o conjunto foi deletado " + arcoIris.isEmpty());
    }
}
