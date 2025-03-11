package arpit.spring_project.dependency_injection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString // Marks a class as a Spring-managed component.
public class Person {

  private String name = "Sumit";
  private int age = 23;
  private String address = "Vastrapur";

  void fun() {
    System.out.println("Inside fun");
  }

}
