package guru.springframework.spring5webapp.di.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public void greetings() {
        System.out.println("Hello World - Property");
    }
}
