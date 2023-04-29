package lab10;

public class MoviesEnt {

    private String Title;
    private String Year;
    private String Genre;
    private String Language;

    public MoviesEnt() {
    }

    public MoviesEnt(String title, String year, String genre, String language) {
        this.Title = title;
        this.Year = year;
        this.Genre = genre;
        this.Language = language;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        this.Year = year;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        this.Genre = genre;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        this.Language = language;
    }

    @Override
    public String toString() {
        return "MoviesEnt{" +
                "title='" + Title + '\'' +
                ", year='" + Year + '\'' +
                ", genre='" + Genre + '\'' +
                ", language='" + Language + '\'' +
                '}';
    }
}
