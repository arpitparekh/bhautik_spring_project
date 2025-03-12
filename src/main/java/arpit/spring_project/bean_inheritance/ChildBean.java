package arpit.spring_project.bean_inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ChildBean {

  @Bean
  String getChildString() {
    return "Bascom Bridge";
  }

}
