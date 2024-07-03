package part3;

import java.util.List;
import java.util.ArrayList;


public class StreamAPI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");

        // lambda
        list.forEach((fruit) -> {
            System.out.println(fruit);
        });
        // method reference
        list.forEach(System.out::println);
        // stream
        list.stream().filter(fruit -> fruit.length() > 5).forEach(System.out::println);
    }
}

