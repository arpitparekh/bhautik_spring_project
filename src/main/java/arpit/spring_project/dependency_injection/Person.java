package arpit.spring_project.dependency_injection;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {

  private String name="Sumit";
  private int age = 23;
  private String address = "Vastrapur";

  void fun() {
    System.out.println("Inside fun");
  }

}
