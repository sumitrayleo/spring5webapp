package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.di.controller.PrimaryBeanController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Spring5webappApplication.class, args);

		PrimaryBeanController controller = (PrimaryBeanController) context.getBean("primaryBeanController");
		controller.greetings();
	}
}
