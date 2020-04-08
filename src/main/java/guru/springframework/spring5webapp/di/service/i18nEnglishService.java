package guru.springframework.spring5webapp.di.service;

import guru.springframework.spring5webapp.di.repository.GreetingRepository;
public class i18nEnglishService implements GreetingService {

    GreetingRepository repository;

    public i18nEnglishService(GreetingRepository repository) {
        this.repository = repository;
    }

    @Override
    public void greetings() {
        System.out.println(repository.getEnglishGreeting());
    }
}
