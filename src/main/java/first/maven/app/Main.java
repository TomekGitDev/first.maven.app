package first.maven.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/first/maven/app/beans/beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		Address address = (Address)context.getBean("address");
		System.out.println(address);
		System.out.println(person);
		
		((FileSystemXmlApplicationContext)context).close();
	}

}
