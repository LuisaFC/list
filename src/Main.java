import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "Marco");
        list.add("Tassio");
        list.add("Joana");

        System.out.println(list.size());

        for(String x: list){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        list.remove("Ana");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'M');


        for(String x: list){
            System.out.println(x);
        }

        System.out.println("-----------------------------------");

        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("-----------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'T').collect(Collectors.toList());

        for(String x: result){
            System.out.println(x);
        }
    }
}