package lambdastreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;


public class lab09 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));
        //Print the name and price in Name:Price format
        items.stream().map(e->e.getName()+":"+e.getPrice()).forEach(e-> System.out.println(e));
        System.out.println("============================================================");

        //Print the names of all the items that cost more than $20
        items.stream().filter(e->e.getPrice()>20).map(e->e.getName()+" costs "+e.getPrice()).forEach(e-> System.out.println(e));
        System.out.println("============================================================");


        //Generate a new list containing the names of all the items (use collect)
        List<String> names=new ArrayList<>();
        names=items.stream().map(e->e.getName()).collect(Collectors.toList());
        names.forEach(e-> System.out.println(e));
    }
}
