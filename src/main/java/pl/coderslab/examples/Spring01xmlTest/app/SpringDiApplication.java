package pl.coderslab.examples.Spring01xmlTest.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.coderslab.examples.Spring01xmlTest.bean.EmailService;
import pl.coderslab.examples.Spring01xmlTest.bean.HelloWorld;
import pl.coderslab.examples.Spring01xmlTest.bean.MessageService;

/**
 * Hello world!
 *
 */
public class SpringDiApplication {
	public static void main(String[] args) {
		// tu używamy abstract bo to implementuje autocloseable
		try (AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {
			System.out.println("Hello World! z klasy SpringDiApplication");
			// HelloWorld hello = (HelloWorld)context.getBean("hello"); // tak
			// można ale nie chcemy castować
			HelloWorld hello = context.getBean("hello", HelloWorld.class); // tu
																			// używamy
																			// metody,
																			// która
			// ma jako drugi parametr taki na co chcemy rzutować
			System.out.println(hello.getMessage());

			// zadanie 3:
			MessageService email = context.getBean("email", EmailService.class);
			email.send();
			// tu używamy metody, która ma jako drugi parametr taki na co chcemy rzutować
//			System.out.println(email.getMessage());

		}

		// do pom.xml dodałem
		// <maven.compiler.source>1.8</maven.compiler.source>
		// <maven.compiler.target>1.8</maven.compiler.target>

		// w beans.xml wstrzyknęliśmy przez konstruktor
	}

}
