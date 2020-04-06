package guru.springframework.spring5webapp.di.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("EN")
@Qualifier("i18nService")
@Service
public class i18nEnglishService implements GreetingService {

    @Override
    public void greetings() {
        System.out.println("Hello World - EN");
    }
}
