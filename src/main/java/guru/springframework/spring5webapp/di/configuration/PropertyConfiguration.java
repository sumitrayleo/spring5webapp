package guru.springframework.spring5webapp.di.configuration;

import guru.springframework.spring5webapp.model.DummyDataSource;
import guru.springframework.spring5webapp.model.DummyJmsBroker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfiguration {

    @Bean
    public DummyJmsBroker dummyJmsBroker(){
        DummyJmsBroker dummyJmsBroker = new DummyJmsBroker();
        return dummyJmsBroker;
    }

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
