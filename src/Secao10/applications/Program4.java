package Secao10.applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Maria"); //adicionar
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marcos"); //adicionar indexado
        System.out.println(list.size()); //tamanho da lista
        list.remove(1); //remover usando index
        list.removeIf(x -> x.charAt(0) == 'M'); //podemos excluir usando o lambda(predicado)
        System.out.println(list.indexOf("Bob")); //procurar e retorna o index do objeto procurado
        System.out.println(list.indexOf("Joana")); //quando ele nao acha ele retorna -1

        //usaremos stream pra filtrar apenas as pessoas que comecem com a letra a
        List<String> lista = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
        //aqui nos primeiro convertemos a lista pra stream
        //depois usamos o lambda para filtrar
        //e depois transformamos ela denovo em list


        for (String x:list) {
            System.out.println(x);
        }

        for (String i:lista) {
            System.out.println(i);
        }

        String name = list.stream().filter(x-> x.charAt(0) == 'A').findFirst().orElse(null);
        //nesta forma ele filtra uma lista e aplica o filter pra encontrar um nome que comece com a
        //depois aplicamos o findFrist, e ele retorna a primeira ocorrencia
        //porem temos que usar o forElse(null)
        //pois caso ele nao encontre uma pessoa ele retorna null

    }
}
