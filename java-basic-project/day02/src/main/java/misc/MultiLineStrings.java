package misc;

public class MultiLineStrings {
    public static void main(String[] args) {
        System.out.println(getJson(new City("Bangalore","India",1000L)));

    }
    public static String getJson(City city){
        return """
                {
                "city":"%s",
                "country":"%s",
                "population":%d
                }
                """.formatted(city.getName(),city.getCountry(),city.getPopulation());
    }
}

class City{
    private String name;
    private String country;
    private Long population;

    public City(String name, String country, Long population) {
        this.name = name;
        this.country = country;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getPopulation() {
        return population;
    }

    public void setPopulation(Long population) {
        this.population = population;
    }
}
