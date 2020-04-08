package guru.springframework.spring5webapp.di.service;

import guru.springframework.spring5webapp.di.repository.GreetingRepository;

public class i18nSpanishService implements GreetingService {

    GreetingRepository repository;

    public i18nSpanishService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void greetings() {
        System.out.println(repository.getSpanishGreeting());
    }
}
