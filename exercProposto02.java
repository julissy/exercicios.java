
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/


public class exercProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?[S/N]");
        String resposta1 = scan.nextLine();
        perguntas.add(resposta1);

        System.out.println("Esteve no local do crime?[S/N]");
        String resposta2 = scan.nextLine();
        perguntas.add(resposta2);

        System.out.println("Mora perto da vítima?[S/N]");
        String resposta3 = scan.nextLine();
        perguntas.add(resposta3);

        System.out.println("Devia para a vítima?[S/N]");
        String resposta4 = scan.nextLine();
        perguntas.add(resposta4);

        System.out.println("Já trabalhou com a vítima?[S/N]");
        String resposta5 = scan.nextLine();
        perguntas.add(resposta5);

    System.out.println(perguntas);
    }
}
