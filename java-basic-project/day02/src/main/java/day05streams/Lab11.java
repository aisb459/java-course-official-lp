package day05streams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab11 {
    private static List<String> linesInCitiesCsvFile = null;
    private static Map<String, List<City>> countryCitiesMap = new HashMap<>();

    public static void main(String[] args) throws Exception{
        linesInCitiesCsvFile  = Files.readAllLines(Paths.get("C:\\Users\\aishwaryab\\Documents\\java-course\\java-basic-project\\cities.csv"));
        populateCountryCitiesMap();

        //Print the names of all the cities
        linesInCitiesCsvFile
                .stream()
                .map(e-> e.split(",")[0])
                .distinct()
                .forEach(System.out::println);


        //Extract and store all the distinct country names alone in a separate file called countries.txt
        linesInCitiesCsvFile
                .stream()
                .map(e-> e.split(",")[0])
                .distinct()
                .forEach(e-> {
                    try {
                        Files.writeString(Path.of("C:\\Users\\aishwaryab\\Documents\\java-course\\java-basic-project\\DistinctCities.txt"), e, StandardOpenOption.APPEND);
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                });


        //Print the count of all cities grouped by country. Use Collectors.groupingBy or Collectors.partitionBy




        //Generate places.json file with all the contents in JSON format

        //Use Lambda or Method Reference wherever applicable

    }
    private static void populateCountryCitiesMap() {
        for (int i = 1; i < linesInCitiesCsvFile.size(); i++) {
            String line = linesInCitiesCsvFile.get(i);
            String[] items = line.split(",");
            String country = items[1];
            City city = new City(items[0], country, Long.parseLong(items[2]));
            if (countryCitiesMap.containsKey(country)) {
                List<City> cities = countryCitiesMap.get(country);
                cities.add(city);
            } else {
                List<City> cities = new ArrayList<>();
                cities.add(city);
                countryCitiesMap.put(country, cities);
            }
        }
    }
}
