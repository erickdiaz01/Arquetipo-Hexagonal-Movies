package co.com.bancolombia.mongo.documents;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Movies")
public class MovieDocument {
    @Id
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
