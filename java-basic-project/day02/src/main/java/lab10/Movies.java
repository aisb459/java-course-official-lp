package lab10;

import com.google.gson.Gson;
import org.json.JSONObject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Optional;

public class Movies {
    static List<String> moviesList=null;
    public static void main(String[] args) throws IOException,URISyntaxException,InterruptedException {
        moviesList=Files.readAllLines(Paths.get("C:\\Users\\aishwaryab\\Documents\\java-course\\java-basic-project\\movies.txt"));
        moviesList
                .stream()
                .parallel()
                .map(e-> {
                        return executeTaskOnMovies(e);
                })
                .forEach(System.out::println);

    }

    private static MovieResponse executeTaskOnMovies(String e)  {
    try{
        //System.out.println("=================" + e);
        //System.out.println(getDetails(e));
        Gson g = new Gson();
        MoviesEnt m = g.fromJson(getDetails(e), MoviesEnt.class);
        //System.out.println(m.toString());
        insertIntoTable(m);
        return new MovieResponse(e,true,"Success");
    }
        catch (URISyntaxException ex) {
            return new MovieResponse(e,false,"Error");
        } catch (IOException ex) {
            return new MovieResponse(e,false,"Error");
        } catch (InterruptedException | SQLException ex) {
            return new MovieResponse(e,false,"Error");
        }

    }

    private static void insertIntoTable(MoviesEnt m) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            Statement statement = connection.createStatement();
            String query = """
                    insert into movies(title, year, genre, language) values('%s','%s','%s','%s')
                    """.formatted(formatMyString(m.getTitle()),m.getYear(),m.getGenre(),m.getLanguage());
            statement.executeUpdate(query);
            statement.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }

    private static Object formatMyString(String title) {
        Optional<String> op=Optional.ofNullable(title);
        if(op.isPresent()){
            return title.replaceAll("'","''");
        }
        else{
            return null;
        }
    }

    private static String getDetails(String e) throws URISyntaxException, IOException, InterruptedException {
        HttpRequest req = HttpRequest
                .newBuilder(new URI("http://www.omdbapi.com//?i=tt3896198&apikey=52d1c7f&t="+e.replaceAll("\\s","+")))
                .GET()
                .build();
        HttpResponse<String> response = HttpClient.newBuilder().build().send(req, HttpResponse.BodyHandlers.ofString());
        String result = response.body();
        return result;
    }
}
