/*Faça uma lista com 6temperaturas,
tire a média entre elas e diga quais temperaturas são maiores que a média
e de qual mês elas são.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ExercProposto01 {
            public static void main(String[] args) {

                List<Mes> semestral = List.of(
                        new Mes("Janeiro",25.5),
                        new Mes("Fevereiro",26.4),
                        new Mes("Março",27.3),
                        new Mes("Abril",24.2),
                        new Mes("Maio",25.3),
                        new Mes("Junho",23.4)
                );
                semestral.add(new Mes("julho", 15.5));

                System.out.println(semestral);
                Iterator<Mes> iterator = semestral.iterator();
                Double tempTotal = 0d;
                while(iterator.hasNext()){
                    Mes mesAtual = iterator.next();
                    tempTotal += mesAtual.getTemperatura();
                }
                Double mediaTemp = tempTotal/semestral.size();
                System.out.printf("A média das temperaturas do semestre é : %.2f graus%n",mediaTemp);

                Iterator<Mes> iterator1 = semestral.iterator();

                List<String> meses = new ArrayList<>();
                while(iterator1.hasNext()) {
                    Mes maiorMes = iterator1.next();
                    if (maiorMes.getTemperatura() > mediaTemp) meses.add(maiorMes.getNome());
                }
                System.out.println("Os meses que tiveram temperaturas acima da média são: " + meses);

            }
}

class Mes {
    private String nome;
    private Double temperatura;

    public Mes(String nome, Double temperatura) {
        this.nome = nome;
        this.temperatura = temperatura;
    }

    public String getNome() {
        return nome;
    }

    public Double getTemperatura() {
        return temperatura;
    }

    @Override
    public String toString() {
        return "Mes{" +
                "nome='" + nome + '\'' +
                ", temperatura=" + temperatura +
                '}';
    }
}