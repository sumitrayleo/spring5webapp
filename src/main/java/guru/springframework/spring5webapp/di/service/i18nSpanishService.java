package guru.springframework.spring5webapp.di.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Qualifier("i18nService")
@Service
public class i18nSpanishService implements GreetingService {

    @Override
    public void greetings() {
        System.out.println("Hola Mundo - ES");
    }
}
