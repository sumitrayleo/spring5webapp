package guru.springframework.spring5webapp.di.service;

import org.springframework.stereotype.Service;

//@Primary
@Service
public class PrimaryBeanGreetingService implements GreetingService {

    @Override
    public void greetings() {
        System.out.println("Hello World - from PRIMARY bean");
    }
}
