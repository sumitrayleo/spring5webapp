package guru.springframework.spring5webapp.di.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingRepositoryImpl implements GreetingRepository {
    @Override
    public String getEnglishGreeting() {
        return "Hello World - EN";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hola Mundo - ES";
    }
}
