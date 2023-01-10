package co.com.bancolombia.mongo;

import co.com.bancolombia.mongo.documents.MovieDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface MongoDBRepository extends ReactiveMongoRepository<MovieDocument, String>, ReactiveQueryByExampleExecutor<MovieDocument>, ReactiveCrudRepository<MovieDocument,String> {
}
