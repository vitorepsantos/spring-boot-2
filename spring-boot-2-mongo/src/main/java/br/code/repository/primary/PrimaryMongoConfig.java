package br.code.repository.primary;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.code.repository.primary",
        mongoTemplateRef = "primaryMongoTemplate")
public class PrimaryMongoConfig {
}
