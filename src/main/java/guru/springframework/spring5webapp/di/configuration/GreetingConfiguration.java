package guru.springframework.spring5webapp.di.configuration;

import guru.springframework.spring5webapp.di.repository.GreetingRepository;
import guru.springframework.spring5webapp.di.service.GreetingService;
import guru.springframework.spring5webapp.di.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingConfiguration {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository){
        return new GreetingServiceFactory(greetingRepository);
    }

    @Profile({"EN", "default"})
    @Primary
    @Bean
    public GreetingService primaryEnglishService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("en");
    }

    @Profile("ES")
    @Primary
    @Bean
    public GreetingService primarySpanishService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.getGreetingService("es");
    }

}
