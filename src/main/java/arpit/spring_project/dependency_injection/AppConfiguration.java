package arpit.spring_project.dependency_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
  /*
   * Annotation based architecture is used to create a bean.
   *
   * creating a bean pool
   *
   * In java based configuration, all the bean methods are defined in the class
   * with @configuration annotation.
   * At runtime, Spring will provide bean
   * definitions by reading those methods.
   * Using @Autowired, the right dependency
   * is assigned by the Spring Container.
   */

  @Bean
  Person getPerson() {
    return new Person();
  }

  @Bean
  PopulationCount getPopulationCount() {
    // return new PopulationCount(getPerson());
    return new PopulationCount(getPerson());
  }

}
