package arpit.spring_project.bean_inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "arpit.spring_project.bean_inheritance")
public class ParentBean {

  @Bean
  String getParentString() {
    return "Tops";
  }

}
