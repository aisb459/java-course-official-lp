package day05streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lab10 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(new Item("Nike", 20.45), new Item("Adidas", 31.45), new Item("Reebok", 29.25), new Item("Puma", 25.15), new Item("Fila", 15.15));

        //Print the name and price of the costliest shoe
        Item costliestShoe= items
                .stream()
                .reduce((a, b) -> a.getPrice() > b.getPrice() ? a : b)
                .get();
        System.out.println(costliestShoe.getName()+" costs "+costliestShoe.getPrice());

        //Print the name and price of the cheapest shoe
        Item cheapestShoe= items
                .stream()
                .min(Comparator.comparingDouble(Item::getPrice))
                .get();
        System.out.println(cheapestShoe.getName()+" costs "+cheapestShoe.getPrice());

        //Concatenate all the item names using comma and print the value (ie., Nike, Adidas, Reebok, Puma, Fila)
        String csvNames=items
                .stream()
                .map(i->i.getName())
                .collect(Collectors.joining(","));
        System.out.println(csvNames);
    }
}
