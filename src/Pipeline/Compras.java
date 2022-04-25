package Pipeline;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Compras {


    public static void main(String args[]){
        List <String> listaCompras = new ArrayList<>();

        listaCompras.add("arroz");
        listaCompras.add("biscoito");
        listaCompras.add("leite");
        listaCompras.add("farinha");
        listaCompras.add("nescau");
        listaCompras.add("cafe");
        listaCompras.add("pao");
        listaCompras.add("manteiga");
        listaCompras.add("macarrao");
        listaCompras.add("tomates");


//System.out.println(listaCompras);

//listando itens que começam com a letra B:
listaCompras
        .stream()
        .filter(b -> b.startsWith("b"))
        .forEach(b -> System.out.println("itens que começam com a letra B " + b));

//listando elementos que começam com a letra E:

        long contagem = listaCompras
                .stream()
                .filter(f-> f.startsWith("f"))
                .count();
        System.out.println("Quantidade de itens na lista com a letra F: " + contagem);

//Organize sua lista em ordem alfabética, mas somente os primeiros 5 elementos
        listaCompras
                .stream()
                .sorted()
                .limit(5)
                .forEach(i -> System.out.println(i));

        //Exiba a sua lista com todos os caracteres em Maiúsculo, como uma String


        String listaMaiuscula =
              listaCompras
                       .stream()
                       .map(s -> s.toUpperCase())
                       .reduce((iten1, iten2) -> iten1 + "---" + iten2)
                       .orElse("Lista vazia");

        System.out.println(listaMaiuscula);
    }




}
