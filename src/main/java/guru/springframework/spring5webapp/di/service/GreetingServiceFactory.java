package guru.springframework.spring5webapp.di.service;

import guru.springframework.spring5webapp.di.repository.GreetingRepository;

public class GreetingServiceFactory {

    private GreetingRepository repository;

    public GreetingServiceFactory(GreetingRepository repository) {
        this.repository = repository;
    }

    public GreetingService getGreetingService(String lang){
        switch (lang){
            case "es":
                return new i18nSpanishService(repository);
            case "en":
            default:
                return new i18nEnglishService(repository);
        }
    }
}
