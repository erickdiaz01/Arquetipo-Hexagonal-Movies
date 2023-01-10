package co.com.bancolombia.model.movie;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    private String id;
    private String name;
    private String sinopsis;
    private String year;
    private String director;
    private Integer rate;

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", name: '" + name + '\'' +
                ", sinopsis: '" + sinopsis + '\'' +
                ", year: " + year + '\'' +
                ", director: " + director +  '\''+
                ", rate: "+ rate+
                '}';
    }
}
