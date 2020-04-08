package guru.springframework.spring5webapp.di.configuration;

import guru.springframework.spring5webapp.model.DummyDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfiguration {

    @Bean
    public DummyDataSource dummyDataSource(){
        DummyDataSource dummyDataSource = new DummyDataSource();
        return dummyDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
        return configurer;
    }
}
