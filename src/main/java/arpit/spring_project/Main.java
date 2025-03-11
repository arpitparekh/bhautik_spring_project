package arpit.spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import arpit.spring_project.dependency_injection.AppConfiguration;
import arpit.spring_project.dependency_injection.PopulationCount;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        PopulationCount count = context.getBean(PopulationCount.class);

        count.display();

    }
}
