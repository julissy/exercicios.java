/*Faça uma lista com 6temperaturas,
tire a média entre elas e diga quais temperaturas são maiores que a média
e de qual mês elas são.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class exercProposto01 {
            public static void main(String[] args) {

                List<Mes> semestral = new ArrayList<>(){{
                    add(new Mes("Janeiro",25.5));
                    add(new Mes("Fevereiro",26.4));
                    add(new Mes("Março",27.3));
                    add(new Mes("Abril",24.2));
                    add(new Mes("Maio",25.3));
                    add(new Mes("Junho",23.4));
                }};

                System.out.println(semestral);
                Iterator<Mes> iterator = semestral.iterator();
                Double tempTotal = 0d;
                while(iterator.hasNext()){
                    Mes mesAtual = iterator.next();
                    tempTotal += mesAtual.getTemperatura();
                }
                Double mediaTemp = tempTotal/semestral.size();
                System.out.println(String.format("A média das temperaturas do semestre é : %.2f graus",mediaTemp));

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