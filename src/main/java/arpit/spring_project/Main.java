package arpit.spring_project;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import arpit.spring_project.bean_inheritance.MyLogic;
import arpit.spring_project.bean_inheritance.ParentBean;
import arpit.spring_project.dependency_injection.ParentAppConfiguration;
import arpit.spring_project.dependency_injection.PopulationCount;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ParentAppConfiguration.class);

        PopulationCount count = context.getBean(PopulationCount.class);

        count.display();
        // ArrayList<String> list = context.getBean(ArrayList.class);
        // System.out.println();

        ApplicationContext context2 = new AnnotationConfigApplicationContext(ParentBean.class);

        MyLogic ml = context2.getBean(MyLogic.class);
        ml.display();

    }
}
