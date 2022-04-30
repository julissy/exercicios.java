/*Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/

import java.util.*;

public class exercProposto02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> perguntas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?[S/N]");
        String resposta = scan.nextLine();
        perguntas.add(resposta.toLowerCase());

        System.out.println("Esteve no local do crime?[S/N]");
        resposta = scan.nextLine();
        perguntas.add(resposta.toLowerCase());

        System.out.println("Mora perto da vítima?[S/N]");
        resposta = scan.nextLine();
        perguntas.add(resposta.toLowerCase());

        System.out.println("Devia para a vítima?[S/N]");
        resposta = scan.nextLine();
        perguntas.add(resposta.toLowerCase());

        System.out.println("Já trabalhou com a vítima?[S/N]");
        resposta = scan.nextLine();
        perguntas.add(resposta.toLowerCase());

    System.out.println(perguntas);

        Iterator<String> respostaSim = perguntas.iterator();
        int totalSim = 0;
        while (respostaSim.hasNext()) {
            String respostaSim1 = respostaSim.next();
            if(respostaSim1.contains("s")) {
                totalSim++;
                System.out.println(totalSim);
            }
        }

       if(totalSim == 2) {
           System.out.println("SUSPEITA");
       } else if (totalSim == 3 || totalSim == 4) {
           System.out.println("CUMPLICE");
       } else if (totalSim == 5) {
           System.out.println("ASSASSINO");
       } else System.out.println("INOCENTE");
    }
}
