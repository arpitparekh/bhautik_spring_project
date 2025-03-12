package arpit.spring_project.dependency_injection;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ParentAppConfiguration extends AppConfiguration {

  @Bean
  @Primary
  ArrayList<String> getParentData() {
    ArrayList<String> list = new ArrayList<>();
    list.add("Apple");
    list.add("Banana");
    list.add("Orange");
    list.add("Mango");
    list.addAll(getList());
    return list;
  }

}
