package br.code.repository.primary;

import com.mongodb.MongoClient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(MultipleMongoProperties.class)
public class MultipleMongoConfig {

    private final MultipleMongoProperties mongoProperties;

    @Bean(name = "primaryMongoTemplate")
    @Primary
    public MongoTemplate primaryMongoTemplate() throws Exception {
        return new MongoTemplate(primaryFactory(this.mongoProperties.getPrimary()));
    }

    @Bean
    @Primary
    public MongoDbFactory primaryFactory(final MongoProperties mongo) throws Exception {
        return new SimpleMongoDbFactory(
                new MongoClient(mongo.getHost(), mongo.getPort()), mongo.getDatabase());
    }

}
