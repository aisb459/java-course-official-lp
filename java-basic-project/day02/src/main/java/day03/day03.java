package day03;

import java.io.File;
//import java.nio.file.Files;
//import java.nio.file.Path;
import java.util.*;
//import java.util.stream.Stream;

public class day03 {
    private static List<String> getRecordFromLine(String line) {
        List<String> values = new ArrayList<String>();
        try (Scanner rowScanner = new Scanner(line)) {
            rowScanner.useDelimiter(",");
            while (rowScanner.hasNext()) {
                values.add(rowScanner.next());
            }
        }
        return values;
    }
    public static void main(String[] args)throws Exception{
        System.out.println("hi");

        List<List<String>> records = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("C:\\Users\\aishwaryab\\Documents\\java-course\\java-basic-project\\cities.csv"));) {
            while (scanner.hasNextLine()) {
                records.add(getRecordFromLine(scanner.nextLine()));
            }
        }

        Map<String,List<String>> countrycitymp=new HashMap<>();//key is country value is cities
        //Map<String,Integer> citywithpopulation=new HashMap<>();
        for (List<String> lstr:records) {
            System.out.println("1=="+lstr.toString());

            if(countrycitymp.containsKey(lstr.get(1))){
                List<String> cities=countrycitymp.get(lstr.get(1));
                cities.add(lstr.get(0));
                countrycitymp.put(lstr.get(1),cities);
            }
            else{
                List<String> cities=new ArrayList<>();
                cities.add(lstr.get(0));
                countrycitymp.put(lstr.get(1),cities);
            }

        }

        Set<String> countryKey=countrycitymp.keySet();
        for (String country: countryKey) {
            System.out.println(country+" ===== "+countrycitymp.get(country).toString());
        }
    }
}
