package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.di.controller.i18nProfileDemoController;
import guru.springframework.spring5webapp.model.DummyDataSource;
import guru.springframework.spring5webapp.model.DummyJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Spring5webappApplication.class, args);

		i18nProfileDemoController controller = (i18nProfileDemoController) context.getBean("i18nProfileDemoController");
		controller.sayHello();

		DummyDataSource dummyDataSource = (DummyDataSource) context.getBean(DummyDataSource.class);
		System.out.println(dummyDataSource);

		DummyJmsBroker dummyJmsBroker = (DummyJmsBroker) context.getBean(DummyJmsBroker.class);
		System.out.println(dummyJmsBroker);
	}
}
