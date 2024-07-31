package dev.codey.movies;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EnvTest {
    @Value("${MONGO_DATABASE}")
    private String mongoDatabase;

    @PostConstruct
    public void printEnv() {
        System.out.println("MongoDB Database: " + mongoDatabase);
    }
}
