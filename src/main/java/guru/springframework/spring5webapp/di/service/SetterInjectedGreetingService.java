package guru.springframework.spring5webapp.di.service;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {

    @Override
    public void greetings() {
        System.out.println("Hello World - Setter");
    }
}
